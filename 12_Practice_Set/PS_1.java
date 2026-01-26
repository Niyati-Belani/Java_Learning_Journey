import java.util.*;

public class PS_1 {
    public static void main(String[] args) {
        // Question1
        int a= 12;
        int b= 04;
        int c= 24;
        int sum= a+b+c;
        System.out.println("The sum is: "+sum);

        // Question2
        float subject1= 81;
        float subject2= 97;
        float subject3= 85;
        float cgpa = (subject1+subject2+subject3)/30;
        System.out.println("The CGPA is: "+cgpa);
        
        // Question3
        System.out.println("What's your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + "! Have a Good Day!");
        sc.close();

        // Question4
        System.out.println("Enter your number:");
        Scanner s = new Scanner(System.in);
        System.out.println(s.hasNextInt());
        s.close();

    }
}


