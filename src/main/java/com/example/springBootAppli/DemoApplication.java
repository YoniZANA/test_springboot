package com.example.springBootAppli;

		import com.example.date_identifiant.DateController;
		import com.example.topic.TopicController;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.context.annotation.ComponentScan;
		import org.springframework.context.annotation.Import;



@SpringBootApplication
@ComponentScan(basePackages = { "com.example"})
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
