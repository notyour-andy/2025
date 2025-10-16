package com.andy.springstudy.ioc.conf;

import com.andy.springstudy.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;

/**
 * foo
 *
 * @author Andy
 * @since 2025-10-16 22:50
 */
@Configuration
public class BeanConfiguration {

    @Bean(name="foo")
    public Foo createFoo(){
        return new Foo();
    }
}
