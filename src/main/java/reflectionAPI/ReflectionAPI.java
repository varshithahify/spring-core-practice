package reflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionAPI {
	 public static void main(String[] args) throws Exception {
		 
	        Class<?> cls = Student.class;
	        System.out.println("Class Name: " + cls.getName());
	        
	        Object obj = cls.getDeclaredConstructor().newInstance();
	        
	        Method method = cls.getDeclaredMethod("display");
	        method.invoke(obj);

	        Field field = cls.getDeclaredField("name");
	        field.setAccessible(true);

	        System.out.println("Field Value: " + field.get(obj));
	    }
}
