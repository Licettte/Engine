package main.api.response.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountPostResponse {
    int count;
    private List<PostResponse> post = new LinkedList<>();
}