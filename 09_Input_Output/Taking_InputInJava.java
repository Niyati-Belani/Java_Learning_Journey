import java.util.Scanner;

public class Taking_InputInJava {
    public static void main(String[] args) {
        System.out.println("Taking input from user...");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1:");
        int a = sc.nextInt();

        System.out.println("Enter number 2:");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("The sum of two number is: "+ sum);

        sc.close();
    }
}
