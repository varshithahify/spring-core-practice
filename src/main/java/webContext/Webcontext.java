package webContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class Webcontext {
	public static void main(String[] args) {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		System.out.println(context.getClass().getSimpleName());
	}
	}
        
                
    
