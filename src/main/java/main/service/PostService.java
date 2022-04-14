package main.service;

import main.api.response.PostPostResponse;
import main.api.response.PostResponse;
import main.api.response.PostUserResponse;
import main.api.response.UserUserResponse;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public PostResponse getGlobalSettings() {


        PostPostResponse postPostResponse = new PostPostResponse();
        PostUserResponse postUserResponse = new PostUserResponse();


        PostResponse postResponse = new PostResponse();


        postResponse.setCount(390);
        postResponse.getPost().add(0, postPostResponse);

        postPostResponse.setUser(postUserResponse);
        postPostResponse.getUser().setId(1);


//
//        postResponse.getPostResponse().setUser(postUserResponse);
//        postResponse.getPostResponse().getUser().setName("Дмитрий Петров");
//        postResponse.getPostResponse().getUser().setId(1);
//
//        postResponse.getPost().getUser().setName("Дмитрий Петров");
//
//        postResponse.getPostPostResponses().add(0, postPostResponse);


//        postResponse.getPost().setTitle("Заголовок поста");
//        postResponse.getPost().setAnnounce("Текст анонса поста без HTML-тэгов");
//        postResponse.getPost().setLikeCount(36);
//        postResponse.getPost().setDislikeCount(3);
//        postResponse.getPost().setCommentCount(15);
//        postResponse.getPost().setViewCount(55);
        return postResponse;

    }
}
//{
//        "count": 390,
//        "posts": [
//        {
//        "id": 345,
//        "timestamp": 1592338706,
//        "user":
//        {
//        "id": 88,
//        "name": "Дмитрий Петров"
//        },
//        "title": "Заголовок поста",
//        "announce": "Текст анонса поста без HTML-тэгов",
//        "likeCount": 36,
//        "dislikeCount": 3,
//        "commentCount": 15,
//        "viewCount": 55
//        },
//        {...}
//        ]
//        }