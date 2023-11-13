package week9;

public class W5P2_Array {
    public static void main(String[] args) {
        System.out.println(checkLetter(new String[]{"Combo", "wedevx", "", " ", "This is the longer string"}, 'G')); // Returns true
        System.out.println(checkLetter(new String[]{"Some characters in the array", "**#12!$%", " "}, '$')); // Returns false
        System.out.println(checkLetter(new String[]{"1", "2", "3", "4", "5"}, '5')); // Returns true

    }
    public static boolean checkLetter(String[] arr, char ch){
        if (arr.length == 0){
            return  false;
        }
        String lastW = arr[arr.length-1];
        String chTargetString = String.valueOf(ch);

        return lastW.toLowerCase().contains(chTargetString.toLowerCase());
    }

}
