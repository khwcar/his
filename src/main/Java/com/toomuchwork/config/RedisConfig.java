package com.toomuchwork.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @ClassName: RedisConfig
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2021/1/7  18:52
 */
@Configuration
public class RedisConfig {
    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){
        JedisConnectionFactory jcf = new JedisConnectionFactory();
        jcf.setHostName("82.156.86.174");
        jcf.setPort(6379);
        jcf.setPassword("khw123");
        return jcf;
    }
    @Bean
    public RedisTemplate redisTemplate(){
        RedisTemplate rt = new RedisTemplate();
        rt.setConnectionFactory(jedisConnectionFactory());
        rt.setKeySerializer(new StringRedisSerializer());
//        rt.setValueSerializer(new StringRedisSerializer());
        return rt;
    }
    @Bean
    public RedisTemplate dd(RedisConfig redisConfig){
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RedisConfig.class);
//        RedisConfig redisConfig = applicationContext.getBean(RedisConfig.class);
        RedisTemplate redisTemplate = redisConfig.redisTemplate();
        return redisTemplate;
    }

}
