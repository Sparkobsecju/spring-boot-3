package com.example.boot;

import com.example.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 啟動 SpringBoot 專案的 Entry Point (入口點程式)
 */
//@SpringBootApplication(scanBasePackages = "com.example")
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.example")
@SpringBootApplication // 這是一個 SpringBoot 應用程式
public class MainApplication {

    public static void main(String[] args) {

        // java10: 區域變數的型別推斷
        var ioc = SpringApplication.run(MainApplication.class, args);

        //1. 獲取 IoC Container 中所有 Component 的名稱
        String[] names = ioc.getBeanDefinitionNames();
        //2. 輸出所有 Component 的名稱:
        // 包含了 dispatcherServlet, beanNameViewResolver, characterEncodingFilter, multipartResolver
        // SpringBoot 把以前配置的核心 Component 都自動配置好了
        // 導入 Scenario Starter, Container 就會自動配置好相關的核心 Component
        // IoC Container 中有了什麼 Component, 就具有什麼功能
        for (String name: names) {
            System.out.println(name);
        }

        Person person = ioc.getBean(Person.class);
        System.out.println("person: " + person);
        System.out.println("=====用 | 表示文本，會保留格式========");
        String s1 = person.getChild().getText().get(2);
        System.out.println(s1);
        System.out.println("=====用 > 表示文本，會壓縮換行變成空格========");
        var s2 = person.getChild().getText().get(3);
        System.out.println(s2);
        var s3 = person.getChild().getText().get(4);
        System.out.println("=====用 | 表示文本，會保留格式========");
        System.out.println(s3);
    }
}
