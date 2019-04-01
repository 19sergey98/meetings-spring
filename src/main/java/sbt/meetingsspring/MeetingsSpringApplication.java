package sbt.meetingsspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class MeetingsSpringApplication {

	@Controller
	@RequestMapping("/hello")
	public class HelloController {
		@RequestMapping(method = RequestMethod.GET)
		public String printHello(ModelMap model) {
			model.addAttribute("message", "Hello Spring MVC Framework!");
			return "hello";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(MeetingsSpringApplication.class, args);


	}

}
