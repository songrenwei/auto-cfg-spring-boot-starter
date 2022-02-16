package com.srw.annotation;

import com.srw.config.AutoCfgConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({AutoCfgConfiguration.class})
public @interface EnableAutoCfg {
}
