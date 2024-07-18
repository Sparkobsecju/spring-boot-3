package com.example.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person") // 和配置文件person前綴的所有組態進行綁定
@Data // 自動生成 JavaBean 的 getter/setter 方法
//@NoArgsConstructor // 自動生成無參數的建構子
//@AllArgsConstructor // 自動生成全參數的建構子
public class Person {
    private String name;
    private Integer age;
    private Date birthDay;
    private Boolean like;
    private Child child; // 聚合物件
    private List<Dog> dogs; // 串列屬性 (裡面是物件)
    private Map<String, Cat> cats; // 表示 Map 屬性 (裡面是物件)
}
