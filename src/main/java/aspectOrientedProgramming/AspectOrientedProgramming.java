package aspectOrientedProgramming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectOrientedProgramming {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCon.class);
    PaymentService service = context.getBean(PaymentService.class);
    service.pay();
    context.close();
}
}
