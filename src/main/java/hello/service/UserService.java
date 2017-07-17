package hello.service;

import hello.model.User;
import leap.core.annotation.Bean;

@Bean
public class UserService {

    public User getHelloUser() {
        User user = User.findOrNull("hello");
        if (null == user) {
            user = new User();
            user.setId("hello");
            user.setName("hello world");
            user.create();
        }
        return user;
    }
}
