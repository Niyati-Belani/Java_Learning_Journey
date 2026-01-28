import java.util.*;

public class string {
    public static void main(String[] args) {

        // Option 1
        String name = new String("Niyati");
        System.out.println(name);

        // Option 2
        String name1 = "Niyati";
        System.out.println(name1);

        // Option 3
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);
        String s = sc.nextLine();
        System.out.println(s);

        sc.close();
    }
}

