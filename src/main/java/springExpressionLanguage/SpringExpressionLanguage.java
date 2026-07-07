package springExpressionLanguage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExpressionLanguage {
	 public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 Student student = context.getBean(Student.class);
		 student.display();
		 context.close();
	 }
	}

	       
	   
