public class VariableArgument 
{
    // static int sum(int a, int b)
    // {
    //     return a+b;
    // }
    // static int sum(int a, int b, int c)
    // {
    //     return a+b+c;
    // }

    // Varargs

    static int sum(int x , int ...arr)
    {
        int result =0;
        for (int i : arr) 
        {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Varargs Tutorial.");
        // System.out.println("The Sum of 4 & 5 is : "+ sum());
        System.out.println("The Sum of 4 & 5 is : "+ sum(1));
        System.out.println("The Sum of 4 & 5 is : "+ sum(4, 5));
        System.out.println("The Sum of 4,3 & 5 is : "+ sum(4, 3, 5));
        System.out.println("The Sum of 4,5,2 & 6 is : "+ sum(4, 5, 2, 6));
        System.out.println("The Sum of 4,5,2,1 & 6 is : "+ sum(4, 5, 2, 6, 1));
        System.out.println("The Sum of 4,3,5,4,1 & 7 is : "+ sum(4, 3, 5, 4, 1, 7));
    }
}
