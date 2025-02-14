import java.util.Scanner;
class ThreeNum {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the first number :");
        a = input.nextInt();
        System.out.println("Enter the second number :");
        b = input.nextInt();
        System.out.println("Enter the third number :");
        c = input.nextInt();

        if (a>b && a>c) {
            System.out.println("The largest number is: " + a);
        } else if (b>a && b>c) {
            System.out.println("The largest number is : " + b);
        
        } else if (a==b && a==c) {
            System.out.println("All numbers are equal");
        } else if (a==b && a>c) {
            System.out.println("The largest number is : " + a);
        } else if (a==c && a>b) {
            System.out.println("The largest number is: " + a);
        } else if (b==c && b>a) {
            System.out.println("The largest number is : " + b);
        }
         
        else {
            System.out.println("The largest number is: " + c);
        }

        
        input.close(); 
    }
}