package week8;

//Create a static method named removeLastWord()
// that takes a String as a parameter and removes the last word
// from it. A word is defined as any sequence of non-space
// characters. You should use StringBuilder to manipulate the
// input string. If the string doesn't contain spaces, the method
// should return the empty string. Then print the result string.
//
//You can use any learned String and StringBuilder methods,
// such as lastIndexOf, delete, length, contains and other.
//
//Parameters:
//
//input (String): The original string from which the last word needs to be removed.
//
//Return Type: void
//
//Example #1:
//
//Parameters:
//
//String input = "Hello world"
//
//Return: void
//
//Output:
//
//Hello
public class W11P3 {
    public static void main(String[] args) {
    removeLastWord("Hello are you a in");
    }
    public static void removeLastWord(String input){
        StringBuilder sb = new StringBuilder(input);
        int lastSpaceIndex = sb.lastIndexOf(" ");
        if (lastSpaceIndex != -1){
            sb.delete(lastSpaceIndex,sb.length());

        }
        System.out.println(sb.toString());
    }
}
