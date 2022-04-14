package main.controller;

import main.api.response.PostResponse;
import main.api.response.UserResponse;
import main.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiPostController {


    private final PostResponse postResponse;
    private final PostService postService;

    public ApiPostController(PostResponse postResponse, PostService postService) {
        this.postResponse = postResponse;
        this.postService = postService;
    }


    @GetMapping("/auth")
    private ResponseEntity<PostResponse> settings() {//оборачивать ответы в спец класс ResponseEntity
        return new ResponseEntity<>(postService.getGlobalSettings(), HttpStatus.BAD_REQUEST); // с помощью него можно менять заголовки возврата
    }

}

