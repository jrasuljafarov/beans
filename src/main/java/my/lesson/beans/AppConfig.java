package my.lesson.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PhoneClass_1 getPhone(){
        return new PhoneClass_1();
    }

}
