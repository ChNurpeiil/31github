package week9;
// Create a static method named countVowelsInArray() that takes
// an array of strings as a parameter. The method should count
// and return the total number of vowels (A, E, I, O, U) among
// all the elements in the array, regardless of letter case
// (uppercase or lowercase).
//
//Example:
//
//Parameters:
//
//String[] arr = ["Hello", "world", "AI"]
//
//Return:
//
//5
public class W11P1 {
    public static void main(String[] args) {
        String[] arr = {"Hello", "world", "AI"};
        countVowelsInArray(arr);
    }
    public static void countVowelsInArray(String[] parameter){
        int vowelCount =0;

        for (int i = 0; i < parameter.length; i++){

            String str = parameter[i].toLowerCase();
            for (int j = 0 ; j <str.length();j++){
                char ch = str.charAt(j);
                if (str.charAt(j) == 'a' || str.charAt(j) == 'e' ||str.charAt(j) == 'o' || str.charAt(j) == 'u' || str.charAt(j) == 'i' ){
                    vowelCount++;
                }
            }
        }
        System.out.println(vowelCount);
    }
}
