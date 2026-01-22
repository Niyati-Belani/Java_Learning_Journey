public class BasicArray 
{
    public static void main(String[] args) 
    {
            //Method1
            int [] marks = new int [5];
            marks[0] = 100;
            marks[1] = 99;
            marks[2] = 95;
            marks[3] = 85;
            marks[4] = 80;
            System.out.println(marks[4]);

            //Method2
            int [] student ;
            student = new int [5];
            student[0] = 1;
            student[1] = 2;
            student[2] = 3;
            student[3] = 4;
            student[4] = 5;
            System.out.println(student[2]);

            //Method3
            int [] city = {1 , 2 , 3};
            System.out.println(city[1]);            
    }
}
