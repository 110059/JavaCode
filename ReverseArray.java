import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
//	[apple, orange, banana]
//    [banana, orange, apple]	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		
		System.out.println(fruits);
		
		List<String> revFruits = new ArrayList<String>();
		
		for(int i=fruits.size()-1; i >= 0; i--) {
			revFruits.add(fruits.get(i));
		}
		
		System.out.println(revFruits);
		
	}

}
