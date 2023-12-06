package w13;

public abstract class Instrument {
    public abstract void play();
    public abstract void display();
}
class Guitar extends Instrument{
    int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }
    @Override
    public void play(){
        System.out.println("The guitar melody");
    }
    @Override
    public void display(){
        System.out.println("This is a guitar with "+strings+" strings");
    }
}
class Piano extends Instrument{
    int keys;

    public Piano(int keys) {
        this.keys = keys;
    }
    @Override
    public void play(){
        System.out.println("The piano melody");
    }
    @Override
    public void display(){
        System.out.println("This is a piano with "+keys+" keys");
    }

    public static void main(String[] args) {
        // Create instances of Guitar and Piano
        Guitar guitar = new Guitar(6);
        Piano piano = new Piano(88);

        // Invoke play() method on each instance
        guitar.play();
        piano.play();

        // Invoke displayInfo() method on each instance
        guitar.display();
        piano.display();
    }
}
