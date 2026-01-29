public class Main {
    public static void main(String[] args) {

        
        Person p1 = new Student("Om", 21, "Computer Engineering");
        Person p2 = new Teacher("Dr. Sharma", 45, "Data Structures");

        p1.displayInfo();
        System.out.println("--------------------");
        p2.displayInfo();
    }
}
