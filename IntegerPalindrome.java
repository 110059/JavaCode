import java.util.Scanner;

public class IntegerPalindrome {
	
	public static boolean palin(Integer num) {
		String revstr = new StringBuilder(num.toString()).reverse().toString();
			
//		System.out.println(str);
//		System.out.println(revstr);
		if(num.toString().equalsIgnoreCase(revstr)) {
			return true;
		}
		return false;		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter string ");
        Scanner scanner = new Scanner(System.in);
        Integer cnt = scanner.nextInt();        
        scanner.close();
        
        System.out.print(IntegerPalindrome.palin(cnt)? "Palindrome" : "Not Palindrome");
	}

}