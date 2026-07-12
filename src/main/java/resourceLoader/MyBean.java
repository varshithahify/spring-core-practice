package resourceLoader;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements ResourceLoaderAware{
	private ResourceLoader loader;
    
	@Override
    public void setResourceLoader(ResourceLoader loader) {
    	 this.loader = loader;
    }    

	 public void show() {
		 Resource resource = loader.getResource( "classpath:data.txt");
		 System.out.println("File Name : " + resource.getFilename());
	    }
	}
   

        
                
                       

        
                
