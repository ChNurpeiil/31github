package w10;

import java.util.ArrayList;
import java.util.List;

public class T12_P4_Array_List_Get_Method {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Book 1", "Book 2", "Book 3", "Book 4", "Book 5"));
        System.out.println(getBook(list, 3));
        System.out.println(getBook(list,1));

    }
    public static String getBook(List<String> books, int index){
        String str = books.get(index);
        return str;
    }
}
