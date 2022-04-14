package main.service;

import main.api.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse getGlobalSettings() {



        UserResponse userResponse = new UserResponse();


        if (!userResponse.getUserResultResponse().getUserUserResponse().isModeration()) { //Если пользователь не модератор возращать 0 в moderationCount и false в moderation


            userResponse.getUserResultResponse().getUserUserResponse().setId(576);
            userResponse.getUserResultResponse().getUserUserResponse().setName("Дмитрий Петров");
            userResponse.getUserResultResponse().getUserUserResponse().setPhoto("/avatars/ab/cd/ef/52461.jpg");
            userResponse.getUserResultResponse().getUserUserResponse().setEmail("petrov@petroff.ru");
            userResponse.getUserResultResponse().getUserUserResponse().setModeration(false);//false в moderation


            userResponse.getUserResultResponse().getUserUserResponse().setModerationCount(0);;//0 в moderationCount
            userResponse.getUserResultResponse().getUserUserResponse().setSettings(true);
        } else {

            userResponse.getUserResultResponse().getUserUserResponse().setId(576);
            userResponse.getUserResultResponse().getUserUserResponse().setName("Дмитрий Петров");
            userResponse.getUserResultResponse().getUserUserResponse().setPhoto("/avatars/ab/cd/ef/52461.jpg");
            userResponse.getUserResultResponse().getUserUserResponse().setEmail("petrov@petroff.ru");
            userResponse.getUserResultResponse().getUserUserResponse().setModeration(true);
            userResponse.getUserResultResponse().getUserUserResponse().getModerationCount();
            userResponse.getUserResultResponse().getUserUserResponse().setSettings(true);
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
