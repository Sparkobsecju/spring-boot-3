package org.example.boot.config;

import org.example.boot.bean.Cat;
import org.example.boot.bean.Dog;
import org.example.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;

@ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException") // 放在組態類別上，表示當 FastsqlException 類別不存在時，這個組態類別中的所有元件才會生效
@SpringBootConfiguration
public class AppConfig2 {

    @ConditionalOnClass(name = "com.alibaba.druid.FastsqlException") // 放在方法上，表示當 FastsqlException 類別存在時，這個方法中的元件才會生效
    @Bean
    public Cat cat01() {
        return new Cat();
    }
    // 但是這個方法中的元件將永遠不會生效，因為若就算 FastsqlException 類別存在
    // 但是因為 @ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException") 這個條件
    // 所以這個方法中的元件不會生效

    @Bean
    public Dog dog01() {
        return new Dog();
    }

    @ConditionalOnBean(value = Dog.class)
    @Bean
    public User Michael() {
        return new User();
    }

    @ConditionalOnMissingBean(value = Dog.class)
    @Bean
    public User Jackson() {
        return new User();
    }

    /**
     * 如果在 FastsqlException 這個類別存在的情況下，則在容器中放入一個 Cat 元件，名稱為 cat01，
     * 否則，就在容器中放入一個 Dog 元件，名稱為 dog01
     * 如果系統中有 dog01 這個元件，就在容器中放入一個 User 元件，名稱為 小毛，
     * 否則，就放一個 User 元件，名稱為 小花
     *
     */
}
