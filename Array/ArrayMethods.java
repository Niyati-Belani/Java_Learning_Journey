public class ArrayMethods 
{
    public static void main(String[] args) 
    {
        int [] age = {18, 35, 60};
        System.out.println("Length of the Age is: "+age.length);

        float [] marks = {98.5f, 85.5f, 91.0f, 99.0f, 74.5f};
        System.out.println("Length of the Marks is: "+marks.length);
        System.out.println(marks[2]);

        String [] students = {"Niyati", "Mayuresh", "Helly"};
        System.out.println("Length of the Students is: "+students.length);
        System.out.println(students[1]);

        System.out.println("Displaying the Array (Naive way)");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
                
        System.out.println("Displaying the Array (ForLoop way)");
        for (int i = 0; i < students.length; i++) 
        {
            System.out.println(students[i]);
        }
        System.out.println("Reverse Order:");
        for (int i = students.length-1; i >= 0 ; i--) 
        {
            System.out.println(students[i]);
        }

        System.out.println("ForEachLoop :");
        for (int element : age) 
        {
            System.out.println(element);
        }
    }
}
