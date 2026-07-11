package circularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependency {
	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext( AppConfig.class);
		A a = context.getBean(A.class);
		a.show();
    }       
                       
}
