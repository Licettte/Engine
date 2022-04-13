package main.controller;

import main.api.response.UserResponse;
import main.model.Users;
import main.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiAuthController {
 private final    UserResponse userResponse;
    private final UserService userService;


    public ApiAuthController(UserResponse userResponse, UserService userService) {
        this.userResponse = userResponse;
        this.userService = userService;

    }

    @GetMapping("/auth")
    private ResponseEntity<UserResponse> settings() {//оборачивать ответы в спец класс ResponseEntity
        return new ResponseEntity<UserResponse>(userService.getGlobalSettings(), HttpStatus.BAD_REQUEST); // с помощью него можно менять заголовки возврата
    }


//    @GetMapping("/auth")
//    private ResponseEntity<Users> settings() {//оборачивать ответы в спец класс ResponseEntity
//        return new ResponseEntity<UserResponse>(users.getGlobalSettings(), HttpStatus.BAD_REQUEST); // с помощью него можно менять заголовки возврата
//    }


}

