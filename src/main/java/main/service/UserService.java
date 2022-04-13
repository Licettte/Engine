package main.service;

import main.api.response.PostEnum;
import main.api.response.UserResponse;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse getGlobalSettings() {



        UserResponse userResponse = new UserResponse();


        if (!userResponse.getResult().getUser().isModeration()) { //Если пользователь не модератор возращать 0 в moderationCount и false в moderation


            userResponse.getResult().getUser().setId(576);
            userResponse.getResult().getUser().setName("Дмитрий Петров");
            userResponse.getResult().getUser().setPhoto("/avatars/ab/cd/ef/52461.jpg");
            userResponse.getResult().getUser().setEmail("petrov@petroff.ru");
            userResponse.getResult().getUser().setModeration(false);//false в moderation


            userResponse.getResult().getUser().setModerationCount(0);;//0 в moderationCount
            userResponse.getResult().getUser().setSettings(true);
        } else {

            userResponse.getResult().getUser().setId(576);
            userResponse.getResult().getUser().setName("Дмитрий Петров");
            userResponse.getResult().getUser().setPhoto("/avatars/ab/cd/ef/52461.jpg");
            userResponse.getResult().getUser().setEmail("petrov@petroff.ru");
            userResponse.getResult().getUser().setModeration(true);
            userResponse.getResult().getUser().getModerationCount();
            userResponse.getResult().getUser().setSettings(true);
        }


//        userResponse.getResult().getUser().setName(userResponse.getResult().getUser().getName());
//        userResponse.getResult().getUser().setPhoto(userResponse.getResult().getUser().getPhoto());
//        userResponse.getResult().getUser().setEmail(userResponse.getResult().getUser().getEmail());
//        userResponse.getResult().getUser().setModeration(userResponse.getResult().getUser().isModeration());
//        userResponse.getResult().getUser().setModerationCount(userResponse.getResult().getUser().getModerationCount());
//        userResponse.getResult().getUser().setSettings(userResponse.getResult().getUser().isSettings());

        return userResponse;
    }


}
