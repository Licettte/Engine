package main.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import main.api.response.post.PostResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserUserResponse {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("photo")
    private String photo;
    @JsonProperty("email")
    private String email;
    @JsonProperty("moderation")
    private boolean moderation;

    @JsonProperty("moderationCount")
    private int moderationCount;

    @JsonProperty("settings")
    private boolean settings;




    public void addPost(PostEnum postEnum, PostResponse postResponse) {
        List<PostResponse> postRespons = new ArrayList<>();
        if (postEnum == PostEnum.NEW || postEnum == PostEnum.DECLINED) {
            moderationCount = moderationCount + 1;
            postRespons.add(postResponse);
//            Значение moderationCount содержит количество постов необходимых для проверки модераторами.
//                    Считаются посты имеющие статус NEW и не проверерны модератором.


        }
    }
}

