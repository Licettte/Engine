package main.api.response;

import java.util.ArrayList;
import java.util.List;

public class Post {

    public void addPost(PostEnum postEnum) {


        List<PostEnum> post = new ArrayList<>();

        if (postEnum == PostEnum.NEW || postEnum == PostEnum.DECLINED) {


//            Значение moderationCount содержит количество постов необходимых для проверки модераторами.
//                    Считаются посты имеющие статус NEW и не проверерны модератором.
        }
    }
}
