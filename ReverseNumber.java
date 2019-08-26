
public class ReverseNumber {
   public static void main(String[] args) {
	   int num = 12345;
	   
	   System.out.println(num);
	   
	   int remainder = 0;
	   int rev = 0;
	   while (num > 0) {		   
		   remainder = num %10;
		   num = num/10;		   
		   rev = rev*10 + remainder;		   
	   }
	   
	   System.out.println(rev);
   }
}
