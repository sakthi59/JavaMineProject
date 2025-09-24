package MineProject.example.MineProject;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import MineProject.example.MineProject.EntityClasses.LoginEntity;
import MineProject.example.MineProject.EntityClasses.configurationList;

@SpringBootApplication
@ComponentScan

public class MineProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MineProjectApplication.class, args);
		
		System.err.println("my first project");
		
		configurationList ob = new configurationList();
		
		Class findClass = ob.getClass();
		
		System.err.println(ob.getClass());
		
		System.err.println(findClass);
		
		Method[] ls = findClass.getMethods();
		
		for (Method method : ls) {
			
			System.err.println(method);
		}
	}

}
