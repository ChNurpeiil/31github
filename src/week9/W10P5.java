package week9;

public class W10P5 {
    public static void main(String[] args) {
        String[] toDoList ={"Buy groceries", "Call the doctor", "Finish the report", "Pay bills"};
        printLastTask(toDoList);
    }
    public static void printLastTask(String[] parameter){
        if (parameter.length == 0 || parameter == null){
            System.out.println("Your to-do list is empty");
        }else {
            //firs find int
            int lastIndex = parameter.length-1;
            //then find String with int
            String lastString = parameter[lastIndex];
            System.out.println("Last Task: " + lastString);
        }

    }
}

