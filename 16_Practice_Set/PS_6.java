public class PS_6 
{
    public static void main(String[] args) 
    {
        //Question1
        System.out.println("Question 1:");
        float [] marks = {50.5f, 65.2f, 89.3f, 95.0f, 99.5f };
        float sum = 0;
        for (float f : marks) 
        {
            sum += f;
        } 
        System.out.println("The Value of Sum is : "+sum);
        System.out.println("\n");

        //Question2
        System.out.println("Question 2:");
        float num = 45.2f;
        boolean isInArray = false;
        for (float f : marks) 
        {
            if (num == f) {
                isInArray = true;
                break;
            }
        }
        if (isInArray)
        {
            System.out.println("The value is Present in the Array..");
        }
        else
        {
            System.out.println("The value is Not Present in the Array..");
        }
        System.out.println("\n");

        //Question3
        System.out.println("Question 3:");
        System.out.println("The Value of average marks is : "+ sum/marks.length);
        System.out.println("\n");

        //Question4
        System.out.println("Question 4:");
        int [][] mat1 = { {1, 2, 3},
                          {4, 5, 6}};
        int [][] mat2 = { {7, 8, 9},
                          {1, 5, 9}};
        int [][] result = { {0, 0, 0},
                          {0, 0, 0}}; 

        for (int i = 0; i < mat1.length; i++) //Row number of times
        {
            for (int j = 0; j < mat1[i].length; j++) //Column number of times
            {
                System.out.format("Setting Value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) //Row number of times
        {
            for (int j = 0; j < mat1[i].length; j++) //Column number of times
            {
                System.out.print(result[i][j]+" ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
        System.out.println("\n");

        //Question5
        System.out.println("Question 5:");
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n= Math.floorDiv(3, 2);
        for (int i = 0; i < n; i++)
        {
            // swap a[i] and a[l-1-i]
            int temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int i : arr) 
        {
            System.out.print(i+" ");
        }
        System.out.println("\n");
       
        //Question6
        System.out.println("Question 6:");
        int max = 0;
        for (int e : arr)
        {
            if(e>max)
            max = e;
        }
        System.out.println("The Maximum number is: "+max);
        System.out.println("\n");

        //Question7
        System.out.println("Question 7:");
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) 
        {
            if (arr[i] > arr[i+1]) 
            {
                isSorted = false;
                break;
            }
        }
        if (isSorted) 
        {
            System.out.println("The Array is Sorted!");
        }
        else
        {
            System.out.println("The Array is Not Sorted!");
        }
    }
}


