package collection;

import java.util.HashMap;

public class WordsOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "clean world green world";
		String [] words = str1.split(" ");
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		for(String word: words) {
			if(map1.get(words)==null ) {
				map1.put(word,1 );
				
			}else {
				int oldOccu = map1.get(word);
				map1.put(word, oldOccu+1);
			}
		System.out.println(map1);
		}
		
	}

}
