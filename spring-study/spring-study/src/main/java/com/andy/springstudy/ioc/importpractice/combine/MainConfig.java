package com.andy.springstudy.ioc.importpractice.combine;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 使用Import注解导入带有@Confiiguration修饰的类，达到组合配置类的目的
 *
 * @author Andy
 * @since 2025-10-22 23:33
 */
@Configuration
@Import({OrderConfig.class, UserConfig.class})
public class MainConfig {
}
