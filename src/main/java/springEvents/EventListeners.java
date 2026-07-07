package springEvents;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListeners {
	 @EventListener
	 public void sendEmail(UserRegisteredEvent event) {
		 System.out.println("Email Sent To : " + event.getUsername());
	  }
	 
	 @EventListener
	 public void createAuditLog(UserRegisteredEvent event) {
		 System.out.println( "Audit Log Created");
	 }
	 
	 @EventListener
	    public void onRefresh(ContextRefreshedEvent event) {
		 System.out.println("Context Refreshed");       
	 }

	 @EventListener
	    public void onClose(ContextClosedEvent event) {
		 System.out.println("Context Closed");     
	 }
	  
	 @EventListener
	    public void onStart( ContextStartedEvent event) {
		 System.out.println( "Context Started");   
	  }
	  
	 @EventListener
	    public void onStop(ContextStoppedEvent event) {
		 System.out.println("Context Stopped");      
	 }
}  
	        
	                
	        
	        
	               
	    
