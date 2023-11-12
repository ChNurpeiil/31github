package week7;

public class W6P2 {
    public static void main(String[] args) {
    printStringWithX("ghjklxhjkXj");
    }
    public static void printStringWithX(String input){
        int counter = 0;

        while (counter < input.length()){
            char currentChar = input.charAt(counter);
            if(String.valueOf(currentChar).equalsIgnoreCase("X")){
                System.out.print(currentChar);
                System.out.print(currentChar);
            }else{
                System.out.print(currentChar);
            }
           counter++;
        }
        System.out.println();
    }
}
