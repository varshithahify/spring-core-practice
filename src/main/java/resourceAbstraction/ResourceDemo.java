package resourceAbstraction;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class ResourceDemo {
	 public void readFile() throws IOException{
		 Resource resource = new ClassPathResource("data.txt");
		 System.out.println("File Name : "+ resource.getFilename());
		 System.out.println("Exists : "+ resource.exists());
		 String data = new String(resource.getInputStream().readAllBytes());	                
		 System.out.println("Content : "+ data);
	    }
}          

	        
	               
	                

	        
	                
	                        
	                                

	        
	                
	                
