package com.andy.springstudy.ioc.importpractice.combine;

import com.andy.springstudy.ioc.importpractice.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 订单配置类
 *
 * @author Andy
 * @since 2025-10-22 23:54
 */
@Configuration
public class OrderConfig {

   @Bean
    public Order order1(){
       return new Order();
   }

}
