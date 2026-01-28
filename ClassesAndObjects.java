class Employee 
{
    int id;
    int salary;
    String name;

    public void printDetails()
    {
        System.out.println("My name is: "+ name);
        System.out.println("My ID is: "+id);
    }  
    
    public int getsalary()
    {
        return salary;
    }
}

public class ClassesAndObjects 
{
    public static void main(String[] args) 
    {
        System.out.println("This is Custom Class.");

        // Creating New Object
        Employee Niyati = new Employee();
        Employee Mayuresh = new Employee();

        // setting Attributes for Niyati
        Niyati.id =20;
        Niyati.name="CodeLover";
        Niyati.salary=80;

        // setting Attributes for Niyati
        Mayuresh.id=10;
        Mayuresh.name="TechFun";
        Mayuresh.salary=100;

        // Printing the attributes
        Niyati.printDetails();
        Mayuresh.printDetails();
        int salary = Mayuresh.getsalary();
        System.out.println(salary);
    }
}
