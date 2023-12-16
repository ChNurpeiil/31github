package w15;

public class Regex {
    public static void main(String[] args) {


        String str = "wedevx.co";
        //matches method returns true if the given regex matches the string
        System.out.println(str.matches("wedevx.co"));

        //character class
        String str1 = "Hello World";
        //takes a regex
        str1 = str1.replaceAll("[e]","");
        System.out.println(str1);


    }
}
