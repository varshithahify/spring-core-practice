package springExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
//	 @Value("#{10 + 20}")
//	 private int sum;
	    
	 
//using method call
//	 @Value("#{'varshitha'.toUpperCase()}")
//	 private String name;
	 
//using Ternary Operator
	 @Value("#{10 > 5 ? 'YES' : 'NO'}")
	 private String result;
	 

//	    public void display() {
//	        System.out.println("Sum = " + sum);
//	        
//	    public void display() {
//		    System.out.println("Name = " + name);
	        
	    public void display() {
	        System.out.println("Result = " + result);    
	    }
}
