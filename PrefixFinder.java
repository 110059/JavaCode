import java.util.ArrayList;
import java.util.List;

public class PrefixFinder {
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();		
		fruits.add("apple");		
		fruits.add("apps");
		fruits.add("appster");
		
		String str = fruits.get(0);
		
		//find the short value
		for(String fruit: fruits) {
			if (str.length() > fruit.length()) {
				str = fruit;
			}
		}
		
		System.out.println("small string is " + str);
		String pref = "";
		Boolean flag = false;
		for(int i = 0; i < str.length(); i++) {			
			char c = str.charAt(i);
			for(int j=0; j<fruits.size(); j++) {
				if(fruits.get(j).charAt(i) != c) {
					flag = true;
					break;
				} 
			}
			
			if(flag == false) {
				pref = pref + c;
			}			
			
		}
		
		System.out.println("prefix is " + pref);        
	}

}
