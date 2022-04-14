package main.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Data
public class PostResponse {

    int count;
    Map<String, String> post = new HashMap();

    {
        post.put("id", null);
        post.put("timestamp", null);
        post.put("user", null);
    }
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("user")

    UserUserResponse user;



    @JsonProperty("title")
    public String title;
    @JsonProperty("announce")
    public String announce;
    @JsonProperty("likeCount")
    public int likeCount;
    @JsonProperty("dislikeCount")
    public int dislikeCount;
    @JsonProperty("commentCount")
    public int commentCount;
    @JsonProperty("viewCount")
    public int viewCount;

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

