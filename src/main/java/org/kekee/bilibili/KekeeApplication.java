package org.kekee.bilibili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class KekeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KekeeApplication.class, args);
	}

}
