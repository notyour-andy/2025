package com.andy.springstudy.ioc.importpractice.ordinary;

import com.andy.springstudy.ioc.importpractice.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 使用@Import导入普通类
 *
 * @author Andy
 * @since 2025-10-22 23:16
 */
@Configuration
@Import(User.class)
public class ImportConfig {

    /*
     * 导入普通类：将普通类实例化Bean，注入到容器中
     */

}
