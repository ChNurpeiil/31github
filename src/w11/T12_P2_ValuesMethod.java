package w11;

import java.util.Map;

public class T12_P2_ValuesMethod {
    public static void main(String[] args) {
        Map<String, Integer> invertory = Map.of("Apples", 50, "Bananas", 30, "Oranges", 40);
        int total = calculateTotalItems(invertory);
        System.out.println("Total items: "+ invertory);

    }
    public static int calculateTotalItems(Map<String, Integer> parameter){
        int number=0;
        for (Integer num : parameter.values()){
            number+= num;

        }
        return number;
    }

}
