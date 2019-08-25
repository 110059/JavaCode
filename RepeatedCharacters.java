import java.util.HashMap;

public class RepeatedCharacters {
	public static void main(String[] args) {
		
		   String str1 = "programming";
			
		   char[] strArry = str1.toCharArray();
		   
		   HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		   
		   for(Character ch: strArry) {
			   if (charMap.containsKey(ch)) {			   
				   charMap.put(ch, charMap.get(ch) + 1); 				   
			   } else {
				   charMap.put(ch, 1); 
			   }
		   }
		   
		   System.out.println(charMap);
		   
		   //iterate hashmap
		  charMap.forEach((k, v) -> System.out.println("Character : " + k + " Count : " + v));
		   
	}
}
