package MineProject.example.MineProject.LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindWordsContainingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words[] = {"abc","bcd","aaaa","cbc"};
		char x='a';
		
		List<Integer> ans = new ArrayList<>();
		
		for (int i = 0; i < words.length; i++) {
			
			System.err.println(words[i].indexOf(x));
            if (words[i].indexOf(x) != -1) {
                ans.add(i);
            }
        }
		System.err.println(ans);
	}

}
