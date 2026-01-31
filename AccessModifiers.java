class MyEmployee
{
    private int id;
    private String name;
    
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int i)
    {
        id =i;
    }
    public int getId()
    {
        return id;
    }

}

public class AccessModifiers
{
    public static void main (String[] args)
    {
        MyEmployee niyati = new MyEmployee();

        //niyati.id = 18;
        //niyati.name = "Niyati";  ---> Throws an error due to private access modifier 

        niyati.setName("Code with Niyati");
        System.out.println(niyati.getName());

        niyati.setId(30016);
        System.out.println(niyati.getId());
    }
}