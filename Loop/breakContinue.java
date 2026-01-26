public class breakContinue 
{
    public static void main(String[] args) 
    {
        System.out.println("Using Break Statment..");
        for(int i=1 ; i <= 5 ;i++)
        {
            System.out.println(i);
            System.out.println("it is "+i+" Number!");
            if(i==3)
            {
                System.out.println("I exit the Loop!");
                break;
            }
        }

        System.out.println("Using Continue Statment..");
        int j=0;
        do
        {
                j++;
                 if(j==3)
                {
                    System.out.println("I skip 3!");
                    continue;
                }
                System.out.println(j);
                System.out.println("it is "+j+" Number!");
               
         
        }while (j<5);
    }
}
