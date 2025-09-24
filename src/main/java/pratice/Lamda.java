package pratice;

import java.util.Arrays;
import java.util.List;

import ch.qos.logback.core.joran.conditional.IfAction;

public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lamda = Arrays.asList("sakthi","vene","veno");
		
		
//		System.err.println(lamda.contains("vene"));
		
//		lamda expression
		lamda.forEach(s-> System.err.println(s));
		
//		methode reference
		lamda.forEach(System.out::println);
	}

}
