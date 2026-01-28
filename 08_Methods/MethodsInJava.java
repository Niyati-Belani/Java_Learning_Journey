
public class MethodsInJava 
{
    static int logic(int x, int y)
    {
        int z;
        if(x > y)
        {
            z = x + y;
        }
        else 
        {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) 
    {
        int a = 3;
        int b = 6;
        int c ;
        c = logic(a,b);
        System.out.println(c);
        int a1 = 10;
        int b1 = 20;
        int c1 ;
        c1 = logic(a1,b1);
        System.out.println(c1);


    }
}
