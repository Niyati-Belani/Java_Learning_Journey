import java.util.*;

public class elseIf_switchCase 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int age;
        System.out.print("Enter your age:");
        age = sc.nextInt();

        // ElseIf Statement
        if(age>56)
        {
            System.out.println("You are experienced!");
        }
        else if(age>46)
        {
            System.out.println("You are semi-experienced!");
        }
        else if(age>36)
        {
            System.out.println("You are semi-semi-experienced!");
        }
        else
        {
            System.out.println("You are not experienced!");
        }

        //SwitchCase Statement
        int myAge;
        System.out.print("Enter your Current age (Choice :- 18,23,30,35,40,58,,65,80): ");
        myAge = sc.nextInt();

        switch (myAge) {
            case 18:
                System.out.println("You are Going to become an Adult!");
                break;
            case 23:
                System.out.println("Enjoy Your Life..!");
                break;
            case 30:
                System.out.println("It's time to Marry.!");
                break;
            case 35:
                System.out.println("It is Family Time.");
                break;
            case 40:
                System.out.println("It's time to make Money!!");
                break;
            case 58:
                System.out.println("It's time to Retirement...");
                break;
            case 65:
                System.out.println("Time to do rest");
                break;
            case 80:
                System.out.println("End Time of the Life!!!");
                break;
        
            default:
                System.out.println("Enter age which is given above!");
                break;
        }
        sc.close();
    }
}
