package MineProject.example.MineProject.LeetCode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	int nums[] ={1,2,1};
	 	
	 	int n = nums.length;
	 	
	 	int[] ans = new int[2 * n];
	 	
	 	for(int i=0;i < n;i++)
	 	{
	 		ans[i] = nums[i];
	 	}
	 	
	 	for(int j = 0;j < n;j++)
	 	{
	 		ans[j + n] = nums[j];
	 	}
	 	
	 	System.out.println(Arrays.toString(ans));
	}

}
