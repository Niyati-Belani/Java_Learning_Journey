/*
    Types of Operators:

    Arithmetic Operators:- + , - , / , * , % , ++ , --
    Assignment Operators:- = , += , -= , /= , *= , %= , &= , |= , ^= , >>= , <<= 
    Comparison Operators:- == , > , < , >= , <= , !=
    Logical Operators:- && , || , !
    Bitwise Operators:- & , | , ^ , >>(Right Shift) , <<(Left Shift) , ~
*/


public class Operators_Associativity_Presedence {
    public static void main(String[] args) {
        int a=12;
        int b=04;
        
        //Arithmetic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);

        //Assignment Operators
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a/=b);
        System.out.println(a*=b);
        System.out.println(a%=b);

        //Comparison Operators
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        //Logical Operators
        System.out.println(a==12 && b==12);
        System.out.println(a==4 || b==4);
        System.out.println(!(a==12 && b==12));

        // Bitwise Operators
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a << 1);
        System.out.println(b >> 1);
        System.out.println(~ a);

        //Associativity & Precedence

        int c;
        c = 6*5-34/2;
        /*
            Left to Right
            =30-34/2
            =30-17
            =13
        */
       System.out.println(c);

       int d;
       d=60/5-34*2;
       /*
        Left to Right
        =12-34*2
        =12-68
        =-56
       */
      System.out.println(d);
    }
}


/*
    Associativity & Precedence

    ()
    *   Left to Right   12
    /   Left to Right   12
    %   Left to Right   12
    +   Left to Right   11
    -   Left to Right   11
    <   Left to Right   8
    <=  Left to Right   8
    >   Left to Right   8
    >=  Left to Right   8


*/
