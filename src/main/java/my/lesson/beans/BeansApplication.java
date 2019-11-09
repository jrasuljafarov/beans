package my.lesson.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeansApplication {

	public static void main(String[] args) {


//		----------------Sample class-----------------------

		new PhoneClass().about();

//		----------------use @Bean annotation--------------------------------

		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		PhoneClass_1 phoneClass_1=applicationContext.getBean(PhoneClass_1.class);
        phoneClass_1.about();
//        ----------------use xml file--------------------------------------------------

		ApplicationContext applicationContext_2=new ClassPathXmlApplicationContext("AppConfig.xml");
		PhoneClass_2 phoneClass_2=applicationContext_2.getBean(PhoneClass_2.class);
        phoneClass_2.about();
	}

}
