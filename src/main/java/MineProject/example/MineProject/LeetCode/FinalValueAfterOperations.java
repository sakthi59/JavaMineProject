package MineProject.example.MineProject.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalValueAfterOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =0;
		
		String[] givenArray = {"--x","x++","x++"};
		
		for (String i : givenArray) {
			
			if (i.equalsIgnoreCase("--x") || i.equalsIgnoreCase("x--")) 
			{
				--x;
			}else 
				x++;
			}
		System.err.print(x);
	}

}
