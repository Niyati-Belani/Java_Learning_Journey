class Employee
{
    int salary;
    String name;

    public int getsalary()
    {
        return salary;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String n)
    {
        name = n;
    }
}

class CellPhone
{
    public void ring()
    {
        System.out.println("Ringing....");
    }
    public void vibrate()
    {
        System.out.println("Vibrating....");
    }
    public void CallFriend()
    {
        System.out.println("Calling Friend....");
    }
}

class Square
{
    int side;

    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}

class TommyVecceti
{
    public void hit()
    {
        System.out.println("Hitting the enemy..");
    }
    public void run()
    {
        System.out.println("Runninf from the enemy..");
    }
    public void fire()
    {
        System.out.println("Firing on the enemy..");
    }
}
public class PS_8 
{
    public static void main(String[] args) 
    {
        //Question 1
        System.out.println("Question 1:");
        Employee niyati = new Employee();
        niyati.setname("CodeLover");
        niyati.salary=233;
        System.out.println(niyati.getsalary());
        System.out.println(niyati.getname());
        System.out.println("");

        //Question 2
        System.out.println("Question 2:");
        CellPhone asus = new CellPhone();
        asus.CallFriend();
        asus.vibrate();
        asus.ring();
        System.out.println("");

        //Question 3
        System.out.println("Question 3:");
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        System.out.println("");

        //Question 4
        System.out.println("Question 4:");
        TommyVecceti tom = new TommyVecceti();
        tom.hit();
        tom.fire();
        tom.run();
    }
}
