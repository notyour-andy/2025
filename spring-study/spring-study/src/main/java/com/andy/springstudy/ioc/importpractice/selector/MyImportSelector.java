package com.andy.springstudy.ioc.importpractice.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ImportSelector接口实现类
 *
 * @author Andy
 * @see <a href=""></a>
 * @since 2025-10-22 23:57
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
                "com.andy.springstudy.ioc.importpractice.selector.A",
                "com.andy.springstudy.ioc.importpractice.selector.B"
        };
    }
}
