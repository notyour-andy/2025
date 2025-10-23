package com.andy.springstudy.condition;

import com.andy.springstudy.Foo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基于配置文件属性的条件注解
 *
 * @author Andy
 * @since 2025-10-23 23:41
 */
@Configuration
@ConditionalOnProperty(prefix = "spring.self", name="loadingCondition3", havingValue = "true")
public class Condition3 {


    @Bean("condition3Foo")
    public Foo foo(){
        return new Foo();
    }
}
