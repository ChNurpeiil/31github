package week9;

public class W5P1 {
    public static void main(String[] args) {
        System.out.println(combineWords(new String[]{"First", "Second", "Third", "Fourth"}, 4));
        System.out.println(combineWords(new String[]{"NonEmpty", "Maybe", "For sure"}, 0));
        System.out.println(combineWords(new String[]{"Good", "Luck", "Beloved", "Champs"}, 3));

    }
    public static String combineWords(String[] arr, int n){
        if (n < 1){
            return "N is not positive";
        }
        if (arr.length == 0){
            return "Array is empty";
        }

        String firstsW = arr[0];
        String secondW = arr[1];

        int word1 = firstsW.length();
        int word2 = secondW.length();


            if (word1 > word2){

                return repeatWord(firstsW, n)+ secondW;
            } else if(word1 < word2){
                return repeatWord(secondW, n)+firstsW;
            } else {
                return "Both are equal";
            }
        }

        public static String repeatWord(String word, int n){
        StringBuilder sb = new StringBuilder();
        for (int i =0; i< n; i++){
            sb.append(word);
        }
        return sb.toString();
        }
    }


