package week7;

public class W3P1 {
    public static void main(String[] args) {
//        Write a program that prints out "$150k/year
//        Job Offer Loading... at wedevx month n" 6 times
//        using a while loop, where n starts from 1 and goes
//        until 6, and then prints "Offer from Airbnb Received!" one time.
//
//Task:
//
//Write a program that uses a while loop to print out
// "$150k/year Job Offer Loading... at wedevx month n"
// six times, with n ranging from 1 to 6.
//
//After printing out the six statements, print
// "Offer from Airbnb Received!" once.
        int num = 1;
        while (num <= 6){
            System.out.println("$150k/year Job Offer Loading... at wedevx month " + num);
            num++;
        }
        System.out.println("Offer from Airbnb Received!");
    }
}
