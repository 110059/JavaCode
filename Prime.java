import java.util.Scanner;

public class Prime {

	public static boolean prim(int num) {
		if(num == 2 || num == 3) {
			return true ;
		}
		
		if(num % 2 == 0) {
			return false;
		}
		
		int sqrt = (int) Math.sqrt(num);
		
		for(int i=3; i<=sqrt; i += 2) {
			if(num % i == 0) {				
				 return false;			
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter no ");
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();        
        scanner.close();
        
        if(Prime.prim(cnt) == true) {
        	System.out.println("Prime number ");
        }
        else {
        	System.out.println("Not Prime number ");
        }
	}
	
	
}
