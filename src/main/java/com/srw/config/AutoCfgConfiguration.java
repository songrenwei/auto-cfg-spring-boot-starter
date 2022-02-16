package com.srw.config;

import com.srw.bean.AutoCfg;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(AutoCfg.class)
@EnableConfigurationProperties(AutoCfgProperties.class)
public class AutoCfgConfiguration {

    private final AutoCfgProperties autoCfgProperties;

    public AutoCfgConfiguration(AutoCfgProperties autoCfgProperties) {
        this.autoCfgProperties = autoCfgProperties;
    }

    @Bean
    @ConditionalOnMissingBean(AutoCfg.class)
    @ConditionalOnProperty(prefix = "auto.cfg",value = "enabled", havingValue = "true")
    AutoCfg autoCfg(){
        return new AutoCfg(autoCfgProperties);
    }
}
