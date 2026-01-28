public class Logical 
{
    public static void main(String[] args) 
    {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // For Logical AND(&&)...
        System.out.println("For Logical AND(&&)...");
        if(a && b && c)
        {
            System.out.println("Yes!");
        }
        else
        {
            System.out.println("No!");
        }

        // For Logical OR(||)...
        System.out.println("For Logical OR(||)...");
         if(a || b)
        {
            System.out.println("Yes!");
        }
        else
        {
            System.out.println("No!");
        }
        // For Logical NOT(!)...
        System.out.println("For Logical NOT(!)...");
        System.out.print("Not (a) is : ");
        System.out.println(!a);
        System.out.print("Not (b) is : ");
        System.out.println(!b);
    }
}

