package w11;

import java.util.Map;

public class T12_P1_ValuesMethod {
    public static void main(String[] args) {
        Map<String, Integer> library = Map.of("Book A", 5, "Book B",3, "Book C",8);
        System.out.println(calculateCatalogSize(library));
    }
    public static int calculateCatalogSize(Map<String, Integer> library){
        int sum =0;
        for (Integer num: library.values()){
            sum+=num;
        }
        return sum;
    }

}
