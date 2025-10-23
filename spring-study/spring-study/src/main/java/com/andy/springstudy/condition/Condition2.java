package com.andy.springstudy.condition;


import com.andy.springstudy.Eggs;
import com.andy.springstudy.UserService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基于容器中 Bean 的条件注解
 *
 * @author Andy
 * @since 2025-10-23 22:46
 */
@Configuration
public class Condition2 {

    /**
     * 若利用Configuration中注入的bean，会报错，与解析顺序有关
     */
//    @ConditionalOnBean(value = {UserService.class})
    @ConditionalOnMissingBean(value = {UserService.class})
    @Bean(name = "condition2Eggs")
    public Eggs eggs(){
        System.out.println("ConditionConfig 中创建 condition2Eggs（因为 foo 存在）"); // 打印日志
        return new Eggs();
    }
}
