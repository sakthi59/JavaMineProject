package MineProject.example.MineProject.LeetCode;

import java.sql.Array;
import java.util.Arrays;

public class Constraints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3,x1=0,y1=n;
		int[]nums = {2,5,1,3,4,7}, result = new int[n*2];
		for (int i = 0; i < nums.length; i++) {
			if(i%2==0)
			{
				result[i]= nums[x1];
				x1++;
			}else {
				result[i]= nums[y1];
				y1++;
			}
		}	
		System.err.println(Arrays.toString(result));
	}

}
