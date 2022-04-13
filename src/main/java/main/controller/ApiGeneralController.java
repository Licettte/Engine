package main.controller;

import main.api.response.InitResponse;
import main.api.response.SettingsResponse;
import main.service.SettingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiGeneralController {
    private final SettingService settingService;
    private final InitResponse initResponse;

    public ApiGeneralController(SettingService settingService, InitResponse initResponse) {
        this.settingService = settingService;
        this.initResponse = initResponse;
    }

    @GetMapping("/settings")
    private ResponseEntity <SettingsResponse> settings() {//оборачивать ответы в спец класс ResponseEntity
        return new ResponseEntity<SettingsResponse>(settingService.getGlobalSettings(), HttpStatus.BAD_REQUEST); // с помощью него можно менять заголовки возврата
    }

//    @GetMapping("/settings")
//    private SettingsResponse settings() {
//        return settingService.getGlobalSettings();
//    }
//
    //new потому что его нет в контексте спринга
//return new SettingsResponse();

    @GetMapping("/init")
    private InitResponse init() {
        return initResponse;
    }
}
