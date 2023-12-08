package w13;

public class RetrieveElement {
    public static void main(String[] args) {
        boolean[] booleans = {true, false, true, false};

        boolean element = retrieveElement(booleans, 2);
        System.out.println(element);

        boolean element1 = retrieveElement(booleans, 6);
        System.out.println(element1);
    }
    public static boolean retrieveElement(boolean[] array, int index){
        try{
            return array[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index out of bounds.");
            return false;
        }
    }

}

