import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
   public static void main(String[] args) {
	   
	   List<Integer> nums = new ArrayList<Integer>();
	   nums.add(10);
	   nums.add(12);
	   nums.add(6);
	   nums.add(8);
	   nums.add(12);
	   nums.add(6);
	   
	   System.out.println(nums);
	   
	   /* method 1
	   List<Integer> numsUnique = nums.stream().distinct().collect(Collectors.toList());
	   System.out.println(numsUnique);
	   */
	   
	   
	   
	   /* method 2
	   List<Integer> numsUnique = new ArrayList<Integer>();
	   for(Integer num : nums) {
		   if(numsUnique.indexOf(num) == -1) {
			   numsUnique.add(num);
		   }
	   }	   
	   System.out.println(numsUnique);
	   */
	   
	   
	   
	   /* method 3 */	   	    
	   Set<Integer> numsUnique = new HashSet<Integer>();
	   for(Integer num : nums) {
		   numsUnique.add(num); 
	   }	
	   System.out.println(numsUnique);
	   
   }
}
