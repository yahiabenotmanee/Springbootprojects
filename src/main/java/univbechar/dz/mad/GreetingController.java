package univbechar.dz.mad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import univbechar.dz.mad.entity.Phone;
import univbechar.dz.mad.entity.User;
import univbechar.dz.mad.entity.Vehicle;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();


	@GetMapping("/user")
	public User greeting(@RequestParam(value ="email", defaultValue = "World") String name) {
		return new User(counter.incrementAndGet(), String.format(template, name),String.format(template,name));
	}

	@GetMapping ("/Vehicle")
	public Vehicle vehicle ( String vehName ) {
		return new Vehicle(counter.incrementAndGet(), String.format(template, vehName), String.format(template, vehicle(vehName)));
	}

	@GetMapping ("/Phone")
	public Phone phone ( String namephone) {
		return new Phone(String.format(template,phone(namephone)));
	}

	@GetMapping("/app")
	public String app(){
		return " you have an notification !";
	}

}
