package main.api.response.post;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PostUserResponse {
    private int id;
    private String name;
}