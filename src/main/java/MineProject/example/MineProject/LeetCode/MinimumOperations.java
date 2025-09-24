package MineProject.example.MineProject.LeetCode;

public class MinimumOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4};
		int ans =0;
		
		for (int i = 0; i < nums.length; i++) {
			
			System.err.println((nums[i]+1)%3 +" "+(nums[i]-1)%3);
			if ((nums[i]+1)%3==0 || (nums[i]-1)%3==0) {
				ans++;
			}
		}
		System.err.println(ans);
	}

}
