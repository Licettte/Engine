package main.controller;

import main.api.response.post.CountPostResponse;
import main.api.response.post.PostResponse;
import main.service.PostService;
import org.dom4j.rule.Mode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiPostController {


    private final CountPostResponse countPostResponse;
    private final PostService postService;

    public ApiPostController(CountPostResponse countPostResponse, PostService postService) {
        this.countPostResponse = countPostResponse;
        this.postService = postService;
    }


    @GetMapping("/post")
    private ResponseEntity<CountPostResponse> settings() {//оборачивать ответы в спец класс ResponseEntity
        return new ResponseEntity<>(postService.getGlobalSettings(new Mode()), HttpStatus.BAD_REQUEST); // с помощью него можно менять заголовки возврата
    }



    @GetMapping()
    public ResponseEntity<PostResponse> getAllPosts(@RequestParam(defaultValue = "0", required = false) int offset,
                                                    @RequestParam(defaultValue = "10", required = false) int limit,
                                                    @RequestParam(defaultValue = "recent", required = false) String mode) {
        PostResponse postResponse = postService.getPostsForMainPage(offset, limit, mode);
        return new ResponseEntity<>(postResponse, HttpStatus.OK);
    }

}

