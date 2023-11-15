package week9;

public class W10P4 {
    public static void main(String[] args) {
        String[] runners1 = {"Alice", "Bob", "Charlie", "David", "Eve"};
        String[] runners2 = {"Charlie"};
        String[] runners3 = {};
        printRaceResult(runners1);
        printRaceResult(runners2);
        printRaceResult(runners3);

    }

    public static void printRaceResult(String[] param) {
        if (param.length == 0 || param == null) {
            System.out.println("No runners in the race");

        } else if (param.length == 1) {
            System.out.println("One Participant: " + param[0]);

        } else {
            String firstString = param[0];
            System.out.println("Winner: " + firstString);
            String lastString = param[param.length - 1];
            System.out.println("Last Place: " + lastString);

        }


    }

}
