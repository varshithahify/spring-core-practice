package resourceAbstraction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ResourceAbstraction {
	 public static void main(String[] args) throws Exception {
		 ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		 ResourceDemo demo = context.getBean(ResourceDemo.class);
		 demo.readFile();
	
	    }
}
	        
	               
	                       

	        

	       
