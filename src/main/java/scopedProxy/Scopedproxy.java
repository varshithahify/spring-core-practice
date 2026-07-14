package scopedProxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Scopedproxy {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserBean a = context.getBean(UserBean.class);     
		UserBean b = context.getBean(UserBean.class);              
		System.out.println(a);
        System.out.println(b);
    }
}
        
                

        
                

        
