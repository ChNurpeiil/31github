package w13;

public class Exceptions {
    public static void main(String[] args) {
        performObjectOperations(0);
        performObjectOperations(null);
        performObjectOperations("Ell");
    }
    public static void performObjectOperations(Object obj){
        try {
            int result = (Integer) obj/0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Error: ArithmeticException= Division by zero");
        }catch (NullPointerException e){
            System.out.println("Error: NullPointerException - Object is null");
        }catch (ClassCastException e){
            System.out.println("Error: ClassCastException - Invalid type casting");
        }
    }
}
