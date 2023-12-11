package w14;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PalindromeUtils {
    public static boolean checkPalindromeWords(String word) {
        if (word == null) {
            System.out.println("nullInputTest executed");
            return false;
        }

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                System.out.println("nonPalindromeWordsTest executed");
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}


class MainTest1 {
    //Write your tests here
    @Test
    public void checkPalindromeWordsTest(){
        String PalindromeWord = "level";
        assertTrue(PalindromeUtils.checkPalindromeWords(PalindromeWord),"'"+PalindromeWord+"' should be a palindrome word.");
    }
    @Test
    public void nonPalindromeWordsTest(){
        String PalindromeWord ="hello";
        assertFalse(PalindromeUtils.checkPalindromeWords(PalindromeWord), "'"+PalindromeWord+"' should be a non-palindrome word.");
    }
    @Test
    public void emptyStringTest(){
        assertTrue(PalindromeUtils.checkPalindromeWords(""), "should be an empty.");
    }
    @Test
    public void singleChacarterTest(){
        // char singleChar = 'a';
        assertTrue(PalindromeUtils.checkPalindromeWords("a"), "should be a single character.");
    }
    @Test
    public void nullInputTest(){
        assertFalse(PalindromeUtils.checkPalindromeWords(null),"Null input should return false.");
    }
}

