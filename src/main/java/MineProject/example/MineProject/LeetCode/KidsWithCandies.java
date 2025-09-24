package MineProject.example.MineProject.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] candies = {2,3,5,1,3};
        List<Boolean> result= new ArrayList<Boolean>();
		int extraCandies = 3,i=0,largestNumber=0;

		while (i < candies.length) {
			
			if (largestNumber < candies[i]) {
				largestNumber = candies[i];
			}
			i++;
		}
		
		System.err.println(largestNumber);
		
					
		for(i=0; i< candies.length;i++) {
			System.err.println(candies[i]+" - "+(candies[i]+extraCandies));
			if (candies[i]+extraCandies >= largestNumber ) {
				result.add(true);
			}else {
				result.add(false);
			}
		}
		
		System.err.println(result);

	}

}
