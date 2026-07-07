package springEvents;

public class UserRegisteredEvent {
	 private String username;
	 
	 public UserRegisteredEvent(String username) {
		 this.username = username;
	   }

	 public String getUsername() {
	      return username;
	    }
}
