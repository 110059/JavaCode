import java.util.Scanner;

public class Factorial {
	// 4!=24   4 * 3 * 2 * 1 
	public static int cnt;
	
	public static int facto(int num) {
		if(num == 0) {
			return 1;
		}
		
		return num * facto(num-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number  ");
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();        
        scanner.close();
        
        System.out.print(Factorial.facto(cnt));
	}
}
