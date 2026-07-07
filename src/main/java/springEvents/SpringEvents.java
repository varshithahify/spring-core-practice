package springEvents;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEvents {
public static void main(String[] args) {
	 AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext( AppConfig.class);
	 context.start();     
	 UserService service = context.getBean(UserService.class);              
	 service.registerUser("Varshitha");
	 context.stop();
	 context.close();
}
}
