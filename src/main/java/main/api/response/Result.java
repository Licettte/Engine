package main.api.response;

import lombok.Data;

@Data
public class Result {

    boolean result;

    User user = new User();

}
