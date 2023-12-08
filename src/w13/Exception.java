package w13;

public class Exception {
    public static int divideNums(int a, int b){

    int result = 0;
        try{
            result= a / b;
        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero occurred.");

        }
        return result;
    }

    public static void main(String[] args) {
        int result = divideNums(10,2);
        System.out.println(result);
        int result1 = divideNums(10,0);
        System.out.println(result1);

    }
}
