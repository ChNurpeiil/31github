package week9;

//Write a method called findMaxWord() that takes a String as
// parameter. The method should split the input string into
// an array of Strings (String[]) using spaces as delimiters.
// It should then find the longest word in the array and
// return it. Delimiter is a space character:
//" "
//Example #1:
//Parameter
//String defaultStr = "The quick brown fox jumps over the lazy dog. The dog barks, but the fox keeps running"
//Return:
//"running"
public class W12P1 {
    public static void main(String[] args) {

        String defaultStr = "The quick brown fox jumps over the lazy dog. The dog barks, but the fox keeps running";
        String longestWord = findMaxWord(defaultStr);
        System.out.println("Longest word: " + longestWord);
    }
    public static String findMaxWord(String parameter){

        if (parameter.isEmpty()){
            return "";
        }
        String[] words = parameter.split(" ");

        String maxWord = words[0];
        for (int i =0; i <words.length;i++){
            maxWord = words[i];
        }
        return maxWord;
    }

}
