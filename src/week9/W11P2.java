package week9;

public class W11P2 {
    //    Create a static method named countWordsInArray() that takes
//    a String[] as a parameter. The method should count and
//    return the total number of words in the entire array,
//    including cases where array elements consist of multiple
//    words or single words. Return 0 if an array is empty.
//
//The definition of a word should be based on space-separated
// substrings. Words can be surrounded by spaces or directly
// connected to punctuation marks.
//
//Example #1:
//Parameters:
//String[] arr = ["Hello, world!", "This is an example."]
//Return: int
//Output:
//6
//Example #2:
//Parameters:
//String[] arr = ["Hello", "World!", "Let's Do It"]
//Return: int
//Output:
//5
//Example #3:
//Parameters:
//String[] arr = []
//Return: int
//Output:
//0
    public static void main(String[] args) {
        String[] str1 = {"Hello, world!", "This is an example."};
        String[] str2 = {"Hello", "World!", "Let's Do It"};
        String[] str3 = {};
        countWordsInArray(str1);
        countWordsInArray(str2);
        countWordsInArray(str3);
    }

    public static void countWordsInArray(String[] arr) {
        int totalWord = 0;
        for (int i = 0; i < arr.length; i++){
            int counter;
            String str= arr[i];
            if (str.equals(" ")){
                counter = 0;
            } else {
                counter =1;
                for (int j = 0; j < str.length(); j++){
                    if (str.charAt(j) == ' '){
                        counter++;
                    }
                }
                totalWord+=counter;
            }
        }
        System.out.println(totalWord);
    }
}
