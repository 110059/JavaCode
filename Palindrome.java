import java.util.Scanner;

public class Palindrome {
	
	public static boolean palin(String str) {
		String revstr = new StringBuilder(str).reverse().toString();
		
//		
//		System.out.println(str);
//		System.out.println(revstr);
		if(str.equalsIgnoreCase(revstr)) {
			return true;
		}
		return false;		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter string ");
        Scanner scanner = new Scanner(System.in);
        String cnt = scanner.next();        
        scanner.close();
        
        System.out.print(Palindrome.palin(cnt)? "Palindrome" : "Not Palindrome");
	}

}
