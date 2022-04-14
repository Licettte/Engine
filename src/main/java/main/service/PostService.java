package main.service;

import main.api.response.Post;
import main.api.response.PostResponse;
import main.api.response.UserResponse;
import main.api.response.UserUserResponse;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public PostResponse getGlobalSettings() {
        PostResponse postResponse = new PostResponse();

        postResponse.setCount(390);

        Post post = new Post();

        UserUserResponse userUserResponse = new UserUserResponse();
        postResponse.setUser(userUserResponse);


        postResponse.getUser().setName("Дмитрий Петров");

        postResponse.setTitle("Заголовок поста");
        postResponse.setAnnounce("Текст анонса поста без HTML-тэгов");
        postResponse.setLikeCount(36);
        postResponse.setDislikeCount(3);
        postResponse.setCommentCount(15);
        postResponse.setViewCount(55);
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