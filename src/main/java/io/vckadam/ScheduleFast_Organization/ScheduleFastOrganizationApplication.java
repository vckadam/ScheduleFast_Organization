package io.vckadam.ScheduleFast_Organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ScheduleFastOrganizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleFastOrganizationApplication.class, args);
	}
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String helloMethod() {
		return "Hello from Organization API";
	}
}
