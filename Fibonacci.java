import java.util.Scanner;

class Fibonacci {

    public static int fibonacci(Integer num) {
        if(num == 1 || num ==2) {
            return 1;
        }
         return fibonacci(num-2 ) + fibonacci(num-1);
    }

    public static void main(String[] args) {
        // fibonacii series
        // 0  1  2  3  4  5  6  7
        // 0  1  1  2  3  5  8  13
    	
    	System.out.println("Enter no ");
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        
        scanner.close();

        for(int i=1; i<=cnt; i++ ) {
            System.out.print(Fibonacci.fibonacci(i) + " ");
        }
    }
}