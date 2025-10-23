package com.andy.springstudy.condition;

import com.andy.springstudy.Foo;
import com.andy.springstudy.ioc.importpractice.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 演示基于类路径（Classpath）的条件注解
 *
 * @author Andy
 * @since 2025-10-23 22:36
 */
@Configuration
@ConditionalOnClass({Foo.class})
//@ConditionalOnMissingClass({"com.andy.springstudy.Foo"})
public class Condition1 {



    @Bean("conditional1User")
    @ConditionalOnClass(Foo.class)
//    @ConditionalOnMissingClass({"com.andy.springstudy.Foo"})
    public User user(){
        return new User();
    }

}
