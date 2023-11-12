package week8;

public class W12P3 {
    public static void main(String[] args) {
        System.out.println(caseInsensetiveReplace("Hello World","hello","hi"));
    }
    public static String caseInsensetiveReplace(String text, String find, String replacement) {
        if (text == null || find == null || replacement == null) {
            return text;
        }

        String textLower = text.toLowerCase();
        String findLower = find.toLowerCase();

        StringBuilder result = new StringBuilder(text);

        int index = textLower.indexOf(findLower);
        while (index != -1){
            result.replace(index,index+find.length(),replacement);
            index = textLower.indexOf(findLower,index+replacement.length());
        }
        return result.toString();


    }
}
