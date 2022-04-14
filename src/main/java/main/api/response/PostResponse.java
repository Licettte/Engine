package main.api.response;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Data

public class PostResponse {
    //private final   PostPostResponse post;


    int count;
    private List<PostPostResponse> post = new LinkedList<>();


}

//{
//    "count": 390,
//    "posts": [
//    {
//        "id": 345,
//        "timestamp": 1592338706,
//        "user":
//        {
//            "id": 88,
//            "name": "Дмитрий Петров"
//        },
//        "title": "Заголовок поста",
//        "announce": "Текст анонса поста без HTML-тэгов",
//        "likeCount": 36,
//        "dislikeCount": 3,
//        "commentCount": 15,
//        "viewCount": 55
//    },
//    {...}
//    ]
//}

