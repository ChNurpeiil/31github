package w11;

import java.util.HashMap;
import java.util.Map;

public class T6_P3_RemoveMethod {
    public static Map<Integer,String> removeOutDated(Map<Integer,String> toDo, Integer removeItem){
        Map<Integer, String> toDoItem = new HashMap<>();
        toDo.remove(removeItem);
        return toDo;
    }

    public static void main(String[] args) {
        Map<Integer, String> toDo = new HashMap<>();
        toDo.put(1,"Buy groceries");
        toDo.put(2, "Finish project");
        toDo.put(3,"Schedule the Interview");

        Integer removeItem = 1;
        System.out.println(removeOutDated(toDo, removeItem));
    }

}
