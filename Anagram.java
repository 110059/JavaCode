import java.util.Arrays;

public class Anagram {
	// cat -   act, tac, atc are anagrams
	public static void main(String[] args) {
		String str1 = "cat";
		String str2 = "tac";
		
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		
		Arrays.sort(str1Arr);
		Arrays.sort(str2Arr);
		
		if(String.valueOf(str1Arr).equals(String.valueOf(str2Arr))) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}		
		
	}

}
