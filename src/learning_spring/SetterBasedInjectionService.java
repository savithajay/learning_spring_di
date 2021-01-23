package learning_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedInjectionService {
	
	private HelloWorldService helloWorldService;

	public HelloWorldService getHelloWorldService() {
		return helloWorldService;
	}

	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	public void getMessageFromSetterClass() {
		helloWorldService.sayHello();
	}
}
