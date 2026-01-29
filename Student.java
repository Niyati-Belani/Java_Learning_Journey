public class Student extends Person {

    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + course);
    }
}
