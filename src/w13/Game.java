package w13;

import java.util.ArrayList;

public class Game {
    String title;
    double price;

    public Game(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
class ActionGame extends Game{
    public ActionGame(String title, double price) {
        super(title, price);
    }
}
class PuzzleGame extends Game{
    public PuzzleGame(String title, double price) {
        super(title, price);
    }
}

class GameStore{
    public static double calculateTotalPrice(ArrayList<Game> games){
        double totalPrice = 0;
        for (Game game: games){
            totalPrice+= game.getPrice();
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        ActionGame actionGame = new ActionGame("ActionGame", 50);
        PuzzleGame puzzleGame = new PuzzleGame("PuzzleGame", 30);

        ArrayList<Game> gamesList = new ArrayList<>();
        gamesList.add(actionGame);
        gamesList.add(puzzleGame);

        double total = GameStore.calculateTotalPrice(gamesList);
        System.out.println("The total price of all games is $"+total);
    }

}
