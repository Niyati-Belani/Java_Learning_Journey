public class PS_7 
{
    static void multiplication(int n)
    {
        for (int i = 0; i <= 10; i++) 
        {
            System.out.format("%d X %d = %d",n , i , n*i );
            System.out.println("");
        }
        
    }

    static void pattern1(int n)
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < i+1; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1_rec(int n)
    {
       if (n > 0)
       {
        pattern1_rec(n-1);
        for (int i = 0; i < n; i++) 
        {
            System.out.print("*");
        }
        System.out.println("");
       }
    }
    // pattern1_rec(4)
    // pattern1_rec(3) + 4 times star and new line
    // pattern1_rec(2) + 3 times star and new line + 4 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line + 4 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line + 4 times star and new line
    
    static int sumRec(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return n + sumRec(n-1);
        }
    }

    // Option 1
    // static void pattern2(int n)
    // {
    //     for (int i = n; i > 0; i--) 
    //     {
    //         for (int j = 0; j < i; j++) 
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // Option 2
    static void pattern2(int n)
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n-i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n)
    {
        if (n == 1)
        {
            return 0;
        }
        else if(n == 2)
        {
            return 1;
        }
        /*
            if (n==1 || n==2)
            {
                return n-1;
            }
        */
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) 
    {
        //Question1
        System.out.println("This is Question 1: ");
        multiplication(8);
        
        //Question2
        System.out.println("This is Question 2: ");
        pattern1(4);

        //Question3
        System.out.println("This is Question 3: ");
        System.out.println("The sum of first n natural number is : " + sumRec(12));

        //Question4
        System.out.println("This is Question 4: ");
        pattern2(4);

        //Question5
        System.out.println("This is Question 5: ");
        // Fibonacci series :- 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 ,......
        // If their any declaration in question like index starts from 0 or 1 else default you have to start with 0
        int c = fib(8);
        System.out.println("The Fibonacci of 8th index is : "+ c);

        //Question6
        System.out.println("This is Question 6: ");
        pattern1_rec(4);

    }
}
