package annotations;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
@ComponentScan("annotations")
class AppConfig {

}

// ======================
// DEPENDENCY INTERFACE
// ======================

interface Pen {
    void write();
}

// ======================
// BEAN 1
// ======================

@Component("bluePen")
@Primary
class BluePen implements Pen {
	public void write() {
        System.out.println("Writing with Blue Pen");
    }
}

@Component("redPen")
class RedPen implements Pen {
	public void write() {
        System.out.println("Writing with Red Pen");
    }
}

@Component
@Scope("singleton")
@Lazy
class Student {
	@Value("Varshitha")
    private String name;
    private Pen pen;
    @Autowired
    public Student(@Qualifier("redPen") Pen pen) {
        this.pen = pen;
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean Initialized");
    }

    public void study() {
        System.out.println("Name: " + name);
        pen.write();
        System.out.println("Studying Spring");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroyed");
    }
}
public class Annotations {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);

        student.study();

        context.close();
    }
}