package org.example.boot.config;

//import com.alibaba.druid.FastsqlException;
import org.example.boot.bean.Pig;
import org.example.boot.bean.Sheep;
import org.example.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

//@Import(FastsqlException.class) // 給 Container 中導入一個 Component 元件, 這個 Component 的名稱是全類名 (套件名+類名)

/**
 * 1. 開啟 Sheep 元件的組態屬性綁定
 * 2. 預設將 Sheep 元件加入到 Container 中
 */
@EnableConfigurationProperties(Sheep.class) // 導入第三方寫好的元件進行組態屬性綁定 (因為系統預設不會將第三方元件掃描到 Container 中 -> Package 不同)
// SpringBoot 預設只掃描自身主程式套件下的元件，所以要將第三方元件加入到 Container 中，需要開啟組態屬性綁定，
// 否則就算第三方元件上標註了 @Component, @ConfigurationProperties 註解，也不會被主程式掃描到 Container 中
@SpringBootConfiguration // 這是一個組態類別，替代以前的xml配置文件。組態類別本身也是一個Spring Container 中的 Component
//@Configuration
public class AppConfig {


    @Bean
    @ConfigurationProperties(prefix = "piggy")
    public Pig pig() {
        return new Pig(); //
    }

    /**
     * 1. Component 預設是 Singleton
     * @return
     */
    @Scope("prototype")
    @Bean("userHaHa") // 替代以前xml中的<bean>元素。Component 在 Container 中的名稱預設是方法名，可以直接修改 Annotation 的值
    public User user01() {
        var user = new User();
        user.setId(1L);
        user.setName("小毛");
        return user;
    }

//    @Bean
//    public FastsqlException fastsqlException() {
//
//        return new FastsqlException();
//    }
}
