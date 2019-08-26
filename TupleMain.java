import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TupleMain {
	
	//input  [[2,4], [5, 8], [9,12], [10, 11], [12, 14]];
	//output [[2,4], [5, 8], [9,12], [12, 14]];	
	
	public static void main(String[] args) {
		List<Tuple> original = Arrays.asList(new Tuple(2, 4), new Tuple(5, 8), new Tuple(9, 12), new Tuple(10, 11), new Tuple(12, 14));
		
		List<Tuple> unique = new ArrayList<Tuple>();
		
		unique.add(original.get(0));
		
		for(int i=1; i<original.size(); i++) {
			
			Tuple next = original.get(i);
			Tuple prev = original.get(i-1);
			
			int nextKey = next.getKey();
			// int nextalue = next.getValue();
			// int prevKey = prev.getKey();
			int prevValue = prev.getValue();
			
			if(nextKey >= prevValue) {
				unique.add(next);
			}				
			
		}
		
		System.out.println(original);
		System.out.println(unique);
	}
	
	

}
