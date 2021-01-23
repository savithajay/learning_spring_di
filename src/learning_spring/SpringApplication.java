package learning_spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = org.springframework.boot.SpringApplication.run(SpringApplication.class, args);

		ConstructorBasedInjectionService constructor = (ConstructorBasedInjectionService) context.getBean("constructorBasedInjectionService");
		constructor.getMessageFromConstructorClass();
		
		SetterBasedInjectionService set = (SetterBasedInjectionService) context.getBean("setterBasedInjectionService");
		set.getMessageFromSetterClass();
	}

}
