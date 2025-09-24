package MineProject.example.MineProject.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetSneakyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,1,1,0};
		List<Integer> resultList = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				
				if (nums[i] == nums[j]) {
					resultList.add(nums[i]);
					System.err.println(nums[i] +" "+ nums[j]);
					break;
				}
			}
		}
		int[] result = new int[resultList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = resultList.get(i);
		}
		System.err.println(Arrays.toString(result));
	}

}
