public class string_methods 
{
    public static void main(String[] args) 
    {
        
        String name = "Niyati";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String ls = name.toLowerCase();
        System.out.println(ls);

        String us = name.toUpperCase();
        System.out.println(us);

        String  nonTrimmeString = "   Niyati   ";
        System.out.println(nonTrimmeString);

        String  trimmeString = nonTrimmeString.trim();
        System.out.println(trimmeString);

        System.out.println(name.substring(2));

        System.out.println(name.substring(1,6));

        System.out.println(name.replace('i','u'));
        
        System.out.println(name.replace("iya","ure"));

        System.out.println(name.startsWith("Niy"));

        System.out.println(name.endsWith("ty"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("i"));

        String name1 ="Niyayatii";
        System.out.println(name1.indexOf("ya"));
        System.out.println(name1.indexOf("ya",1));
        System.out.println(name1.lastIndexOf("ya"));
        System.out.println(name1.lastIndexOf("ya",2));

        System.out.println(name.equals("Niyati"));
        System.out.println(name.equalsIgnoreCase("niYati"));
    }
}
