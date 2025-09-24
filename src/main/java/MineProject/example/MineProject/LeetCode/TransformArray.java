package MineProject.example.MineProject.LeetCode;

import java.util.Arrays;
import java.util.Iterator;

public class TransformArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {4,3,2,1};
		int[] ans = new int[nums.length];
		int find = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i]%2 == 0) {
				ans[i] = 0; 
			}else {
				ans[i] = 1;
			}
		}
//		System.err.println(Arrays.toString(ans));
		
		for (int i = 0; i < ans.length; i++) {
			
			for (int j = i+1; j < ans.length; j++) {
				
				System.out.println("in "+ans[i]+" "+ans[j]);
				if (ans[i]>ans[j]) {
					System.out.println("index "+i+" "+j);
					find = ans[i];
					ans[i] = ans[j];
					ans[j] = find;
					System.out.println("out "+ans[i]+" "+ans[j]);
				}
				System.out.println(Arrays.toString(ans));
			}
			
		}
		System.err.println(Arrays.toString(ans));
	}

}
