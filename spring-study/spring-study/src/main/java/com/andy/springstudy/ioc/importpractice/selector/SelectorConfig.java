package com.andy.springstudy.ioc.importpractice.selector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 使用@Import导入ImportSelector接口实现类，实现类的动态加载
 *
 * @author Andy
 * @since 2025-10-23 00:01
 */
@Configuration
@Import(MyImportSelector.class)
public class SelectorConfig {

}
