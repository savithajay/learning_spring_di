package learning_spring;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldService {

	@Override
	public void sayHello() {
		System.out.println("Hello world!");
	}
	
	

}
