package MineProject.example.MineProject.LeetCode;

import java.util.Arrays;

public class maximumWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] accounts = {{1,2,5},{4,2,1}};
		int bigestNumber = 0,priviousNumber=0;
		
		for(int i=0;i < accounts.length;i++)
		{
			priviousNumber = 0;
			for (int j = 0; j < accounts[0].length; j++) {
				
				priviousNumber = priviousNumber + accounts[i][j];
			}
			
			if (bigestNumber < priviousNumber) {
				bigestNumber = priviousNumber;
			}
		}
		System.err.println(bigestNumber);
	}

}
