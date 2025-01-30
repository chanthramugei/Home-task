import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter the first num:");
        a = scanner.nextInt(); 
        System.out.println("Enter the second num:");
        b = scanner.nextInt(); 

        System.out.println("Before swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        scanner.close(); 
    }
}
