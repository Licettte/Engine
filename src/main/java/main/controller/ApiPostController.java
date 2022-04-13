package main.controller;

import main.api.response.InitResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiPostController {
    private final InitResponse initResponse;

    public ApiPostController(InitResponse initResponse) {
        this.initResponse = initResponse;
    }

    @GetMapping("/api/post")
    private InitResponse init() {
        return initResponse;
    }
}

