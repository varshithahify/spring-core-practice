package classLoader;

public class ClassLoaderProgram {
	 public static void main(String[] args) {
		 ClassLoader loader = Student.class.getClassLoader();
		 System.out.println(loader);
		 System.out.println(loader.getClass().getName());
	     
		    }
	}

	       
	            
	  