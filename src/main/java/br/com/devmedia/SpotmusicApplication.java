package br.com.devmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpotmusicApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(SpotmusicApplication.class, args);
	}
}