package processor;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class Student {
	public Student() {
        System.out.println("3. Student Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("5. @PostConstruct");
    }
}
