package week9;

public class W10P2 {
    public static void main(String[] args) {
        String[] sentences = {"Hello World", "Java Code", "Test Results"};
        System.out.println(findLastWordLength(sentences));
    }
    public static int findLastWordLength(String[] input){
        if (input.length == 0 || input == null ){
            return 0;
        }

        int sum =0;

        for (int i =0 ; i< input.length; i++){
            String input1 = input[i];

            if (input1 ==null || input1.isEmpty()){
                continue;
            }

            String[] words = input1.split(" ");

            if (words.length ==0){
                continue;
            }
            String lastWord = words[words.length -1];
            sum+= lastWord.length();

        }
        return sum;
    }
}
