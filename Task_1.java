import java.util.*;

public class Task_1 {
    public static void main(String[] args) {

        System.out.println("Taking Marks From the User For Given Subject...");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Maths Marks: ");
        int Maths = sc.nextInt();

        System.out.println("Enter Physics Marks: ");
        int Physics = sc.nextInt();

        System.out.println("Enter Chemistry Marks: ");
        int Chemistry = sc.nextInt();

        System.out.println("Enter English Marks: ");
        int English = sc.nextInt();

        System.out.println("Enter Sanskrit Marks: ");
        int Sanskrit = sc.nextInt();

        float Percentage = ((Maths+Physics+Chemistry+English+Sanskrit)/500.00f)*100;

        System.out.println("The percentage of these five subjects is: "+Percentage);

        sc.close();
    }
}
