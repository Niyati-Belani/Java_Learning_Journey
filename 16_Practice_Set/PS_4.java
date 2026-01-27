import java.util.*;

public class PS_4 {
    public static void main(String[] args) {
        //Question1
        System.out.println("Question 1");
        int a = 10;
        if(a == 11)
        {
            System.out.println("I'm 11!");
        }
        else
        {
            System.out.println("I'm not 11!");
        }

        //Question2
        System.out.println("Question 2");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Maths Marks:");
        int m1 = sc.nextInt();

        System.out.print("Enter your Physics Marks:");
        int m2 = sc.nextInt();

        System.out.print("Enter your Chemistry Marks:");
        int m3 = sc.nextInt();

        float avg = (m1+m2+m3)/3;

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
        {
            System.out.println("Congratulations!,Your are Pass!");
        }
        else
        {
            System.out.println("Sorry!,Please Try Next Time! ");
        }

        //Question3
        System.out.println("Question 3");
        System.out.print("Enter your Annual Income in Lakhs:");
        float tax = 0;
        float income = sc.nextFloat();

        if(income <= 2.5)
        {
            tax = tax + 0;
        }
        else if(income > 2.5f && income <= 5f)
        {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income > 5f && income <= 10f)
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if(income >= 10f)
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The Total Tax Paid by the Employee is: "+ tax);

        //Question4
        System.out.println("Question 4");
        System.out.print("Enter your day: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday!!");
                break;
        
            default:
                System.out.println("Envalid Day!");
                break;
        }
        
       //Question5
        System.out.println("Question 5");


        //Question6
        System.out.println("Question 6");
        System.out.print("Enter Your Website name: ");
        String website = sc.next();
        if (website.endsWith(".org")) 
        {
            System.out.println("This is an Organizational Website.");
        }
        else if(website.endsWith(".com"))
        {
            System.out.println("This is a Commercial Website.");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("This is an Indian Website.");
        }
        else 
        {
            System.out.println("Envalid website name.");
        }
        

        sc.close();
    }
}