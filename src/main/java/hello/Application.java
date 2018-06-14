package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	@RequestMapping("/")
	public String home() {
		logger.debug("controller called at {}", System.currentTimeMillis());
		return "Hello Kubernetes World V 1.0.3";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
