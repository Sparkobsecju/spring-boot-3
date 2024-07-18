package org.example.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot303LoggingApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot303LoggingApplication.class, args);
    }

    /**
     * 日誌預設格式
     *
     * 2024-07-18T07:07:50.531-07:00  INFO 13908 --- [boot3-03-logging] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
     * 2024-07-18T07:07:50.531-07:00  INFO 13908 --- [boot3-03-logging] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.25]
     *
     * 預設輸出格式：
     * 時間和日期： 毫秒級精度
     * 日誌級別： ERROR, WARN, INFO, DEBUG, TRACE
     * 行程ID： 13908
     * ---： 分隔符
     * 執行緒名稱(thread)： main -> 使用[]包裹
     * Logger名稱： o.apache.catalina.core.StandardService -> 產生日誌訊息的類別
     * 日誌訊息： Starting service [Tomcat]
     *          Starting Servlet engine: [Apache Tomcat/10.1.25] -> 日誌紀錄的內容
     *
     * 注意： logback 沒有 FATAL 級別，對應的是 ERROR 級別
     */

    /** jps 查看 Java 虛擬機中的所有行程(process)：
     *
     * ~/spring-boot-3$ jps
     * 3282 Main
     * 13908 Boot303LoggingApplication
     * 12728 MainApplication
     * 14008 Jps
     * 9983 RemoteMavenServer36
     */
}
