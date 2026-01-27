public class PS_3 
{
    public static void main(String[] args) 
    {
        //Question1
        String name = "John Deo";
        name = name.toLowerCase();
        System.out.println(name);

        //Question2
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        //Question3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter=letter.replace("<|name|>", "Niyati");
        System.out.println(letter);

        //Question4
        String myString = "This string contains  double and tripple spaces.";
        System.out.println("Double:"+myString.indexOf("  "));
        System.out.println("Tripple:"+myString.indexOf("   "));

        //Question5
        String letter2 = "Dear Niyati,\n\t You are such a Beautiful!\n\t Lots of Love!";
        System.out.println(letter2);

    }
}
