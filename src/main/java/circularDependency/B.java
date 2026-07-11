package circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
	 @Autowired
	 private A a;
	    
	 public void show() {
		 System.out.println("B Bean");
	    }
}
