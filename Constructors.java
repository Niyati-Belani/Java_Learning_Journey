class MyEmployee
{
    private int id;
    private String name;
    
    public MyEmployee()
    {
        id = 10;
        name = "Programming With Mayuresh";
    }
    public MyEmployee(String myName , int myId)
    {
        id = myId;
        name = myName;
    }
    public void setName(String n){ this.name = n; }
    public String getName(){ return name; }
    public void setId(int i){ this.id =i; }
    public int getId(){ return id; }

}

public class Constructors 
{
    public static void main(String[] args) 
    {
        MyEmployee niyati = new MyEmployee( "Programming With Niyati" , 20 );
        MyEmployee mayuresh = new MyEmployee();
        // niyati.setName("Code with Niyati");
        // niyati.setId(20);
        System.out.println(niyati.getId());
        System.out.println(niyati.getName());
        System.out.println(mayuresh.getId());
        System.out.println(mayuresh.getName());
    }
    
}
