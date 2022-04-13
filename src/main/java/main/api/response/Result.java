package main.api.response;

import lombok.Data;

@Data
public class Result {

    boolean result =false;   // Возвращайте result:false пока у вас не реализована авторизация пользователей.

    User user = new User();

}
