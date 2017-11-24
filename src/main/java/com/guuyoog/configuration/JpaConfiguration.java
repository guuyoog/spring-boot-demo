package com.guuyoog.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Guy
 * @create 2017/11/24  14:50
 * <p>
 * 类似SSM架构下，spring需要配置Java POJO类包路径以及DAO层接口路径，以自动扫描相关注解，
 * 这里同样需要配置这两项，不同的是Spring采取的是xml配置方式，这里用Java代码+注解方式配置
 **/
@Order(Ordered.HIGHEST_PRECEDENCE)
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = "com.guuyoog.repository")
@EntityScan(basePackages = "com.guuyoog.entity")
public class JpaConfiguration {

    @Bean
    PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

}
