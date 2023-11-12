package week7;

public class W6P1 {
//    Write a static method that takes two Strings as parameters, concatenates them,
//    and prints out all the characters of the concatenated String separated with a
//    dash (-) in a single line using a while loop and printf.
//
//The method signature should be:
//
//public static void printConcatenatedString(String str1, String str2)
//
//The method should concatenate str1 and str2, and then iterate through the
// concatenated String using a while loop to print out each character
// separated with a dash (-) in a single line.
//
//For example, if we call printConcatenatedString("hello", "world"), the output should be:
//
//h-e-l-l-o-w-o-r-l-d-
//
//If we call printConcatenatedString("Java", "is easy"), the output should be:
//
//J-a-v-a-i-s- -e-a-s-y-
public static void main(String[] args) {
printConcatenatedString("Java","рл");
}
public  static  void printConcatenatedString(String str1, String str2){
    String concat = str1+str2;
    int lengthConcat = concat.length();
    int index =0;
    while (lengthConcat -1 >= index){
        System.out.printf("%c-",concat.charAt(index));
        index++;
    }
    System.out.println();;
}
}
