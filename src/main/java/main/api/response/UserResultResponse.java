package main.api.response;

import lombok.Data;

@Data
public class UserResultResponse {

    boolean result =false;   // Возвращайте result:false пока у вас не реализована авторизация пользователей.

    UserUserResponse userUserResponse = new UserUserResponse();

}
