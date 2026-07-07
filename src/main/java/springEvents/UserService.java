package springEvents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
    private ApplicationEventPublisher publisher;
	
	public void registerUser(String name) {
		System.out.println("User Registered : " + name);

        publisher.publishEvent(new UserRegisteredEvent(name));
    }
}
