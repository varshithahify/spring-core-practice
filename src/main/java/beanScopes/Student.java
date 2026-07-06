package beanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//using Singleton Scope
//@Scope("singleton")

//using Prototype Scope
@Scope("prototype")


public class Student {
public Student() {
	System.out.println("Student object created:" + this);
}
}
