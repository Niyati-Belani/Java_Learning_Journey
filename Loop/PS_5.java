public class PS_5 
{
    public static void main(String[] args) 
    {
        //Question1
        System.out.println("Question 1");
        int n = 4;
        for (int i = n; i > 0; i--) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Question2
        System.out.println("Question 2");
        int sum = 0;
        int num = 3;
        int j = 0;
        while (j < num) 
        {
            sum = sum + (2 * j);
            j++;
        }
        System.out.println("Sum of even numbers is : "+sum);

        //Question3
        System.out.println("Question 3");
        int n1 = 5;
        for (int i = 1; i <= 10; i++) 
        {
            System.out.printf("%d X %d = %d\n", n1, i , n1*i);
        }

        //Question4
        System.out.println("Question 4");
        for (int i = 10; i >= 1; i--) 
        {
            System.out.printf("%d X %d = %d\n", n1, i , n1*i);
        }

        //Question5
        System.out.println("Question 5");
        int n2 = 5;
        // Factorial of 5 is 5*4*3*2*1=120
        int i = 1;
        int fac = 1;
        while(i<=n2)
        {
            fac = fac * i;
            i++;
        }
        System.out.println(fac);

        //Question6
        System.out.println("Question 6");
        int n3 = 8;
        int sum1 = 0;
        for (int k = 1; k <= 10; k++) 
        {
           sum1 += n3*k;    
        }
        System.out.println(sum1);
    }
}
