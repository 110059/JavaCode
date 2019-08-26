
public class ReverseWordString {

	// I Love Java Programming
	// Programming Java Love I 
	public static void main(String[] args) {
		String str = "I Love Java Programming";
		
		System.out.println(str);
		
	    String[] strArr = str.split(" ");
						
		String finalStr = "";
		for(int i= strArr.length -1; i>=0; i--) {
			finalStr += strArr[i] + " ";
		}
		
		System.out.println(finalStr);
		
	}

}
