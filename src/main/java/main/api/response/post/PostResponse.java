package main.api.response.post;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PostResponse {

    private Integer id;
    private Long timestamp;
    private PostUserResponse user;
    private String title;
    private String announce;
    private int likeCount;
    private int dislikeCount;
    private int commentCount;
    private int viewCount;

}