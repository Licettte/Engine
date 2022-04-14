package main.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PostPostResponse {
        @JsonProperty("id")
        int id;
        @JsonProperty("timestamp")
        int timestamp;

        @JsonProperty("user")
       PostUserResponse user;

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
