public class Recursion 
{
    static int factorial_iterative(int n)
    {
        //factorial(n) = n * n-1 * n-2 * ......1
        //factorial(n) = n * factorial(n-1)
        //factorial(0) = 1
        if ( n==0 || n==1)
        {
            return 1;
        }
        else
        {
            int product = 1;
            for (int i =1 ; i <=n ; i++)
            {
                product *= i;
            }
            return product;
        }
        

    }
    static int factorial (int n)
    {
        //factorial(n) = n * n-1 * n-2 * ......1
        //factorial(n) = n * factorial(n-1)
        //factorial(0) = 1
        if ( n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }

    }
    public static void main(String[] args) 
    {
        int x = 4;
        System.out.println("The Value of Factorial X is : "+ factorial(x));
        System.out.println("The Value of Factorial X is : "+ factorial_iterative(x));
    }
}
