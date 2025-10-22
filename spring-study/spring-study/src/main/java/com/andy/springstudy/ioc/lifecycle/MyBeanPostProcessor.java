package com.andy.springstudy.ioc.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    //前置处理
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // 初始化前的处理（如日志记录、属性修改）
        System.out.println("初始化前的处理");
        return bean; // 可返回原Bean或包装后的Bean
    }

    //后置处理
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //初始化后的处理
        System.out.println("初始化后的处理");
        return bean;
    }
}