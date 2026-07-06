package beanScopes;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScope{
	public static void main(String[] args) {
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfi.class);
			Student s1 = context.getBean(Student.class);
	        Student s2 = context.getBean(Student.class);
	        System.out.println(s1);
	        System.out.println(s2);
	        System.out.println("Same Object ? " + (s1 == s2));
	        context.close();
	    }
	}

