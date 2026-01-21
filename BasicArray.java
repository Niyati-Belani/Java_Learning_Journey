package Array;

public class BasicArray {
    static public void main(String[] args) {
        
        int[] marks = new int[5] ;

        marks[0]=78;
        marks[1]=80;
        marks[2]=90;
        marks[3]=96;
        marks[4]=69;

        for (int i = 0; i < marks.length; i++) {
            System.out.println( i + ": " + marks[i]);
        }
    }
}
