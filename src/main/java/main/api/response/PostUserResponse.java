package main.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PostUserResponse {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
}
