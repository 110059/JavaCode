import java.util.Scanner;

public class GCD {
	
	
	public static int gcd(int num1, int num2) {
		
		if(num2 == 0) {
			return num1;
		}
		
		return gcd(num2, num1%num2);
		
	}
	
    public static void main(String[] args) {		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no 1");
        int n1 = scanner.nextInt(); 
        System.out.println("Enter no 2");
        int n2 = scanner.nextInt();   
        scanner.close();        
        
        System.out.println(GCD.gcd(n1, n2));
	} 

}
