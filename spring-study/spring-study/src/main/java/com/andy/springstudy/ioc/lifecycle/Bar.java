package com.andy.springstudy.ioc.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Spring bean的生命周期演示
 *
 * @author Andy
 * @since 2025-10-16 23:29
 */
@Component
public class Bar implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    /*
     * 1. 实例化
     * 2. 属性注入
     * 3. 初始化
     *   1) Aware接口回调（如实现）: BeanNameAware、eanFactoryAware、ApplicationContextAware
     *
     */

    private String name;

    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void getOtherBean(String otherBeanName){
        //获取容器类其他bean
        System.out.println("current bean name: " + name);
        Object bean = applicationContext.getBean(otherBeanName);
        System.out.println(bean.getClass());
    }

    //1. 初始化
    @PostConstruct
    public void init(){
        System.out.println("post construct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }


    //2. 销毁

    @PreDestroy
    public void preDestroy() {
        System.out.println("执行@PreDestroy");
    }

    // 2. DisposableBean的方法（其次执行）
    @Override
    public void destroy() throws Exception {
        System.out.println("执行DisposableBean的destroy");
    }

}
