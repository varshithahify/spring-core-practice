package processor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Processor {
public static void main(String[] args) {
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigu.class);
	        context.getBean(Student.class);
	        context.close();
	    }
	}

