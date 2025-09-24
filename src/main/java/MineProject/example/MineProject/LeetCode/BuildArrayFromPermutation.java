package MineProject.example.MineProject.LeetCode;

public class BuildArrayFromPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {0,2,1,5,3,4};
				
				int[] ans = new int[num.length] ;
				
				for(int i =0; i < num.length; i++)
				{
					
					ans[i] = num[num[i]];
					
					System.err.println(ans[i]);
				}
			
	}

}
