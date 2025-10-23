package com.andy.springstudy;

import com.andy.springstudy.ioc.conf.BeanConfiguration;
import com.andy.springstudy.ioc.importpractice.Order;
import com.andy.springstudy.ioc.importpractice.User;
import com.andy.springstudy.ioc.importpractice.selector.A;
import com.andy.springstudy.ioc.importpractice.selector.B;
import com.andy.springstudy.ioc.lifecycle.Bar;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringStudyApplication {

    public static void main(String[] args) {
        //1. Spring启动时默认创建
        ConfigurableApplicationContext  defaultContext = SpringApplication.run(SpringStudyApplication.class, args);

        //2. 根据配置类加载
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        //3. 两个容器互相隔离，但他们都有Foo的bean定义，可以获取，但属于不同的实例
        Foo fooA = defaultContext.getBean(Foo.class);
        Foo fooB = annotationConfigApplicationContext.getBean(Foo.class);
        System.out.println(fooA == fooB);

        //4.测试使用配置类容器获取全局容器的bean，获取不到
        try{
            Bar bar = annotationConfigApplicationContext.getBean(Bar.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("没有这个bean定义");
        }catch (Exception e){

        }

        //使用@Import导入普通类
//        User user = defaultContext.getBean(User.class);
        //使用@Import导入配置类
//        User u1 = defaultContext.getBean("user1", User.class);
//        Order o1 = defaultContext.getBean("order1", Order.class);
        //导入mportSelector接口实现类
        A a = defaultContext.getBean(A.class);
        B b = defaultContext.getBean(B.class);

        String[] names = defaultContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }


}
