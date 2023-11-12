package week7;

public class W3P4 {
//Create a Java program that prints all the even or
// odd numbers up to that input, depending on the parameter.
// Implement a static method named printOddOrEvenNumbers()
// that takes 2 parameters: an int and a char
// ('O' for odd or 'E' for even) to determine which type
// of numbers to print. The program should utilize a while
// loop to iterate through the numbers and print the selected type.
//
//Example:
//
//Parameters:
//
//printOddOrEvenNumbers(10, 'E')
//
//Return: void
//
//Output:
//
//2
//4
//6
//8
//10
public static void main(String[] args) {
printOddOrEvenNumbers(10,'E');
}
public static int printOddOrEvenNumbers(int N, char ch){

    int start;
    int increment = 2;
    if(ch == 'E'){
        start = 2;
    }else{
        start = 1;
    }
    int num = start;
    while (num<=N){
            System.out.println(num);
        num+= increment;
    }
    return 0;
}

}
