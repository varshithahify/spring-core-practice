package rootContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RootContext {
	 public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 UserService service = context.getBean(UserService.class);      
		 service.show();                 
	 }
	}
	        
	                

	       
	   
