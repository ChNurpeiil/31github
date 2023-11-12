package week7;

public class W6P4 {
//    Create a static method named searchCharacter() that
//    takes 2 parameters: String and char. It should search
//    for the given character within the string using a while loop.
//    The method should return the int number of times the
//    character appears in the string.
//
//Example:
//
//Params: "hello world", 'l'
//Return: 3
public static void main(String[] args) {
   int str = searchCharacter("hello world",'l');
   System.out.println(str);
}
public  static int searchCharacter(String input, char target){
   int count = 0;
   int index = 0;
   while (input.length() > index){
       char currentChar = input.charAt(index);
       if(currentChar == target){
          count++;
       }
       index++;

   }
   return count;
}
}
