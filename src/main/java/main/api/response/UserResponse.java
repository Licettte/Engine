package main.api.response;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserResponse {
    UserResultResponse userResultResponse = new UserResultResponse();
}

