package w12;

public class T3P2_VariableSetter {
    public int value;
    public String text;

    public T3P2_VariableSetter(int value, String text){
        this.value= value;
        this.text = text;
    }
    public void setValues(int value, String text){
        this.value= value;
        this.text = text;
    }
    public void printValues(){
        System.out.println("Value: " + value + ",Text: " + text);

    }

    public static void main(String[] args) {
        T3P2_VariableSetter obj = new T3P2_VariableSetter(10, "Hello");
        obj.printValues();
        obj.setValues(20, "World");
        obj.printValues();
    }

}
