import java.util.Scanner;

public class Armstrong {
	
	// 153 = 1^3 + 5^3 + 3^3;
	
	public static void arm(int num) {
		int c=0; 
		int temp; 
		int a;
		
		temp=num;
		while(num > 0) {
			
			// System.out.println("before num " + num);
			
			a = num % 10;
			c = c+(a*a*a);			
			num = num / 10;		
			
			
			// System.out.println("a " + a);
			// System.out.println("after num " + num);
			
		}
		
		if(temp == c ){
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
				
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number  ");
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();        
        scanner.close();
        
        Armstrong.arm(cnt);
	}
}
