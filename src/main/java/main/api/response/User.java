package main.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class User {

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


    public void addPost(PostEnum postEnum) {// пользователей много, от каждого может быть несколько постов.

        // т.е для модерации нужна Map, чтобы добавлять туда новые посты....

        if (postEnum == PostEnum.NEW || postEnum == PostEnum.DECLINED) {
            moderationCount = moderationCount + 1;

//            Значение moderationCount содержит количество постов необходимых для проверки модераторами.
//                    Считаются посты имеющие статус NEW и не проверерны модератором.
        }
    }
}

