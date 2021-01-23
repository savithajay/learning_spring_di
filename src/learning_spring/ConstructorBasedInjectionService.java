package learning_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedInjectionService {
	
	private HelloWorldService helloWorldService;

	@Autowired
	public ConstructorBasedInjectionService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	
	public void getMessageFromConstructorClass() {
		helloWorldService.sayHello();
	}
	
	

}
