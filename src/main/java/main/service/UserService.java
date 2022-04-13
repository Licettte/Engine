package main.service;

import main.api.response.SettingsResponse;
import main.api.response.UserResponse;
import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse getGlobalSettings() {

        UserResponse userResponse = new UserResponse();
        userResponse.getResult().getUser().setId(576);
        userResponse.getResult().getUser().setName("Дмитрий Петров");
        userResponse.getResult().getUser().setPhoto("/avatars/ab/cd/ef/52461.jpg");
        userResponse.getResult().getUser().setEmail("petrov@petroff.ru");
        userResponse.getResult().getUser().setModeration(true);
        userResponse.getResult().getUser().setModerationCount(56);
        userResponse.getResult().getUser().setSettings(true);


//        userResponse.getResult().getUser().setName(userResponse.getResult().getUser().getName());
//        userResponse.getResult().getUser().setPhoto(userResponse.getResult().getUser().getPhoto());
//        userResponse.getResult().getUser().setEmail(userResponse.getResult().getUser().getEmail());
//        userResponse.getResult().getUser().setModeration(userResponse.getResult().getUser().isModeration());
//        userResponse.getResult().getUser().setModerationCount(userResponse.getResult().getUser().getModerationCount());
//        userResponse.getResult().getUser().setSettings(userResponse.getResult().getUser().isSettings());

        return userResponse;
    }


}
