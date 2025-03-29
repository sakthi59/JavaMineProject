package MineProject.example.MineProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan

public class MineProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MineProjectApplication.class, args);
		
		System.err.println("my first project");
	}

}
