import java.util.Scanner;

public class ReverseString {
	
	public static String revs(String str) {
		String revStr = "";
		
		for(int i = str.length() -1; i >=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		
		return revStr;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter string  ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();        
        scanner.close();
        
        System.out.print(ReverseString.revs(str));
	}

}
