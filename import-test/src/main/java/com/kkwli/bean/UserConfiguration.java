package com.kkwli.bean;

import org.springframework.context.annotation.Bean;

public class UserConfiguration {
    @Bean
    public User getUser() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(30);
        return user;
    }
}
