package main.service;

import main.api.response.post.PostResponse;
import main.api.response.post.CountPostResponse;
import main.api.response.post.PostUserResponse;
import main.model.Posts;
import org.dom4j.rule.Mode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PostService {




    public CountPostResponse getGlobalSettings(Mode mode) {
        PostResponse postResponse = new PostResponse(); // тут id; int timestamp; PostUserResponse user; title; announce; dislikeCount; commentCount; viewCount;

        PostUserResponse postUserResponse = new PostUserResponse(); //тут  user id name

        CountPostResponse countPostResponse = new CountPostResponse(); // это овтет в котроллер

        countPostResponse.setCount(390);
        countPostResponse.getPost().add(0, postResponse);

        postResponse.setUser(postUserResponse);
        postResponse.getUser().setId(1);
        postResponse.getUser().setName("DimDim");


//.
        return countPostResponse;

    }

    public PostResponse getPostsForMainPage(int offset, int limit, String mode) {
        Page<Posts> posts = getSortedPosts(offset, limit, mode); //<Posts> база данных . выводится от offset до  limit

//         mode:
//        recent - сортировать по дате публикации, выводить сначала новые (если mode не задан,
//                использовать это значение по умолчанию)
//        popular - сортировать по убыванию количества комментариев (посты без комментариев
//        выводить)
//        best - сортировать по убыванию количества лайков (посты без лайков и дизлайков
//        выводить)
//        early - сортировать по дате публикации, выводить сначала старые

        return getPostResponse(posts);
    }

    private Page<Posts> getSortedPosts(int offset, int limit, String mode) {
        int page = offset / limit;
        Pageable pageable = PageRequest.of(page, limit);
        Page<Posts> posts = null;

        if (mode.equals(SortingMode.RECENT.toString().toLowerCase())) {
            pageable = PageRequest.of(page, limit, Sort.by("time").descending());
            posts = postRepository.findPostsByIsActiveAndModerationStatusAndTimeBefore(IS_ACTIVE,
                    ModerationStatus.ACCEPTED, utilityService.getTimeNow(), pageable);
        } else if (mode.equals(SortingMode.POPULAR.toString().toLowerCase())) {
            posts = postRepository.getPostsByCommentsCount(IS_ACTIVE, ModerationStatus.ACCEPTED,
                    utilityService.getTimeNow(), pageable);
        } else if (mode.equals(SortingMode.BEST.toString().toLowerCase())) {
            posts = postRepository.getPostsByLikesCount(IS_ACTIVE, ModerationStatus.ACCEPTED,
                    utilityService.getTimeNow(), pageable);
        } else if (mode.equals(SortingMode.EARLY.toString().toLowerCase())) {
            pageable = PageRequest.of(page, limit, Sort.by("time").ascending());
            posts = postRepository.findPostsByIsActiveAndModerationStatusAndTimeBefore(IS_ACTIVE,
                    ModerationStatus.ACCEPTED, utilityService.getTimeNow(), pageable);
        }

        return posts;
    }



}
