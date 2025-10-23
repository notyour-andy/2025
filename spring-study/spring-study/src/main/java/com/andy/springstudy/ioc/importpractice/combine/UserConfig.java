package com.andy.springstudy.ioc.importpractice.combine;

import com.andy.springstudy.ioc.importpractice.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 用户配置类
 *
 * @author Andy
 * @since 2025-10-22 23:34
 */
@Configuration
public class UserConfig {

    @Bean
    public User user1(){
        return new User();
    }
}
