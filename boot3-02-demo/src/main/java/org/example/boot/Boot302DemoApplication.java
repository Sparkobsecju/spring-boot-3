package org.example.boot;

//import com.alibaba.druid.FastsqlException;
import org.example.boot.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot302DemoApplication {

    public static void main(String[] args) {
        var ioc = SpringApplication.run(Boot302DemoApplication.class, args);

//        for (String name: ioc.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
        /*
         * print
         *
         * org.springframework.context.annotation.internalConfigurationAnnotationProcessor
         * org.springframework.context.annotation.internalAutowiredAnnotationProcessor
         * org.springframework.context.annotation.internalCommonAnnotationProcessor
         * org.springframework.context.event.internalEventListenerProcessor
         * org.springframework.context.event.internalEventListenerFactory
         * boo302DemoApplication
         * org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory
         * appConfig
         * helloController
         * userHaHa
         * org.springframework.boot.autoconfigure.AutoConfigurationPackages
         * org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
         * propertySourcesPlaceholderConfigurer
         * org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration
         * fileWatcher
         * sslPropertiesSslBundleRegistrar
         * sslBundleRegistry
         * org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor
         * org.springframework.boot.context.internalConfigurationPropertiesBinder
         * org.springframework.boot.context.properties.BoundConfigurationProperties
         * org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter
         * spring.ssl-org.springframework.boot.autoconfigure.ssl.SslProperties
         * org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration$TomcatWebSocketConfiguration
         * websocketServletWebServerCustomizer
         * org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration
         * org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat
         * tomcatServletWebServerFactory
         * org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration
         * servletWebServerFactoryCustomizer
         * tomcatServletWebServerFactoryCustomizer
         * server-org.springframework.boot.autoconfigure.web.ServerProperties
         * webServerFactoryCustomizerBeanPostProcessor
         * errorPageRegistrarBeanPostProcessor
         * org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletConfiguration
         * dispatcherServlet
         * spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties
         * org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration
         * dispatcherServletRegistration
         * org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration
         * org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$ThreadPoolTaskExecutorBuilderConfiguration
         * threadPoolTaskExecutorBuilder
         * org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$TaskExecutorBuilderConfiguration
         * taskExecutorBuilder
         * org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$SimpleAsyncTaskExecutorBuilderConfiguration
         * simpleAsyncTaskExecutorBuilder
         * org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$TaskExecutorConfiguration
         * applicationTaskExecutor
         * org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration
         * spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties
         * org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration
         * error
         * beanNameViewResolver
         * org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration
         * conventionErrorViewResolver
         * spring.web-org.springframework.boot.autoconfigure.web.WebProperties
         * org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
         * errorAttributes
         * basicErrorController
         * errorPageCustomizer
         * preserveErrorControllerTargetClassPostProcessor
         * org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration
         * welcomePageHandlerMapping
         * welcomePageNotAcceptableHandlerMapping
         * localeResolver
         * themeResolver
         * flashMapManager
         * mvcConversionService
         * mvcValidator
         * mvcContentNegotiationManager
         * requestMappingHandlerMapping
         * mvcPatternParser
         * mvcUrlPathHelper
         * mvcPathMatcher
         * viewControllerHandlerMapping
         * beanNameHandlerMapping
         * routerFunctionMapping
         * resourceHandlerMapping
         * mvcResourceUrlProvider
         * defaultServletHandlerMapping
         * requestMappingHandlerAdapter
         * handlerFunctionAdapter
         * mvcUriComponentsContributor
         * httpRequestHandlerAdapter
         * simpleControllerHandlerAdapter
         * handlerExceptionResolver
         * mvcViewResolver
         * mvcHandlerMappingIntrospector
         * viewNameTranslator
         * org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter
         * defaultViewResolver
         * viewResolver
         * requestContextFilter
         * org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
         * formContentFilter
         * org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration
         * mbeanExporter
         * objectNamingStrategy
         * mbeanServer
         * spring.jmx-org.springframework.boot.autoconfigure.jmx.JmxProperties
         * org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration
         * springApplicationAdminRegistrar
         * org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration
         * forceAutoProxyCreatorToUseClassProxying
         * org.springframework.boot.autoconfigure.aop.AopAutoConfiguration
         * org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration
         * applicationAvailability
         * org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration
         * standardJacksonObjectMapperBuilderCustomizer
         * spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties
         * org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration
         * jacksonObjectMapperBuilder
         * org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration
         * parameterNamesModule
         * org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration
         * jacksonObjectMapper
         * org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonMixinConfiguration
         * jsonMixinModuleEntries
         * jsonMixinModule
         * org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
         * jsonComponentModule
         * org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration
         * org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration
         * lifecycleProcessor
         * spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties
         * org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration
         * stringHttpMessageConverter
         * org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration
         * mappingJackson2HttpMessageConverter
         * org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration
         * org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration
         * messageConverters
         * org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
         * spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties
         * org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration
         * spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties
         * org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor
         * org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$ThreadPoolTaskSchedulerBuilderConfiguration
         * threadPoolTaskSchedulerBuilder
         * org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$TaskSchedulerBuilderConfiguration
         * taskSchedulerBuilder
         * org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$SimpleAsyncTaskSchedulerBuilderConfiguration
         * simpleAsyncTaskSchedulerBuilder
         * org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration
         * spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties
         * org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration$ThymeleafWebMvcConfiguration$ThymeleafViewResolverConfiguration
         * thymeleafViewResolver
         * org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration$ThymeleafWebMvcConfiguration
         * org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration$DefaultTemplateResolverConfiguration
         * defaultTemplateResolver
         * org.springframework.boot.autoconfigure.thymeleaf.TemplateEngineConfigurations$DefaultTemplateEngineConfiguration
         * templateEngine
         * org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration
         * spring.thymeleaf-org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties
         * org.springframework.boot.autoconfigure.web.client.RestClientAutoConfiguration
         * httpMessageConvertersRestClientCustomizer
         * restClientSsl
         * restClientBuilderConfigurer
         * restClientBuilder
         * org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration
         * restTemplateBuilderConfigurer
         * restTemplateBuilder
         * org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration$TomcatWebServerFactoryCustomizerConfiguration
         * tomcatWebServerFactoryCustomizer
         * org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration
         * org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration
         * characterEncodingFilter
         * localeCharsetMappingsCustomizer
         * org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration
         * multipartConfigElement
         * multipartResolver
         * spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties
         * org.springframework.aop.config.internalAutoProxyCreator
         */


//        String[] forType = ioc.getBeanNamesForType(User.class);
//        String[] forType = ioc.getBeanNamesForType(FastsqlException.class);
//        for (String s: forType)
//            System.out.println(s);
//        // print : userHaHa
//
//        Object object1 = ioc.getBean("userHaHa");
//        Object object2 = ioc.getBean("userHaHa");
//        System.out.println(object1 == object2); // false (Prototype)
//
//        Object object3 = ioc.getBean("com.alibaba.druid.FastsqlException");
//        Object object4 = ioc.getBean("com.alibaba.druid.FastsqlException");
//        System.out.println(object3 == object4); // true (Singleton by default)


        for (String s: ioc.getBeanNamesForType(Cat.class))
            System.out.println("cat: " + s);

        for (String s: ioc.getBeanNamesForType(Dog.class)) {
            System.out.println("dog: " + s);
        }

        for (String s : ioc.getBeanNamesForType(User.class)) {
            System.out.println("user: " + s);
        }

        Pig bean = ioc.getBean(Pig.class);
        System.out.println("pig: " + bean);

        Sheep sheep = ioc.getBean(Sheep.class);
        System.out.println("sheep: " + sheep);
    }

}
