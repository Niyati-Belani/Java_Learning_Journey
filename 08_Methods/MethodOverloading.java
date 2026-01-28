public class MethodOverloading 
{
    static void change(int a)
    {
        a = 98;
    }
    static void change2(int [] arr)
    {
        arr[0] = 98;
    }
    static void tellJoke()
    {
        System.out.println("I invented a new Word!\n"+ "Plagiarism!");
    }

    //Method overloading

    static void foo()
    {
        System.out.println("Good Morning Buddieee!");
    }
    static void foo(int a)
    {
        System.out.println("Good Morning Buddieee! "+ a +" !");
    }
    static void foo(int a, int b)
    {
        System.out.println("Good Morning Buddieee! "+ a +" !" + b +" !");
    }
    
    public static void main(String[] args) 
    {
        tellJoke();

        int x = 45;
         change(x);
         System.out.println("The value of X after running change is : "+ x);

        int [] marks = {52,73,77,89,98,94};
         change2(marks);
         System.out.println("The value of Marks after running change is : "+ marks[0]);

        //Method overloading
        
        foo();
        foo(101);
        foo(101 ,365 );
        // Arguments are actual!
    }
}
