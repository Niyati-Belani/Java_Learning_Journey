import java.util.*;

public class PS_2 
{
    public static void main(String[] args) 
    {
        //Question1

        float a = 7/4.0f * 9/2.0f;
        /*
            =1.75*9/2
            =15.75/2
            =7.875
        */
       System.out.println(a);

       //Question2

        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println(grade);

        //Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

       //Question3

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>8);

        //Question4

        int v = sc.nextInt();
        System.out.println(((v*v)-(4*4))/2.00f);

        //Question5

        int c = 7*49/7+35/7;
        System.out.println(c);

        sc.close();
    }
}
