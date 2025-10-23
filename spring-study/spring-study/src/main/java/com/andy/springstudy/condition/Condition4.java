package com.andy.springstudy.condition;

import com.andy.springstudy.Foo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基于表达式的条件注解
 *
 * @author Andy
 * @see <a href="">基于表达式的条件注解</a>
 * @since 2025-10-23 23:48
 */
@Configuration
@ConditionalOnExpression("${spring.self.loadingCondition3:true} && ${spring.self.loadingCondition4:true}")
public class Condition4 {

    @Bean("condition4Foo")
    public Foo foo(){
        return new Foo();
    }
}
