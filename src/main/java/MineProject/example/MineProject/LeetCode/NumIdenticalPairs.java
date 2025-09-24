package MineProject.example.MineProject.LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumIdenticalPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,1,1,3};
		//todo find the paring also
//		List<Integer> findParing = new ArrayList<Integer>();
		int ans = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = i+1; j < nums.length; j++) {
				
				if (nums[i]==nums[j]) {
					ans = ans+1;
//					findParing.add(null);
				}
			}
		}
		System.err.println(ans);
	}

}
