package w13;

public interface Movable {
    void moveForward(int distance);
    void moveBackward(int distance);
}
interface Resizable{
    void increaseSize(int factor);
    void decreaseSize(int factor);
}
class Body implements Movable, Resizable{
    int height;
    int width;

    public Body(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void moveForward(int distance) {
        height+=distance;
    }

    @Override
    public void moveBackward(int distance) {
       height-=distance;
    }

    @Override
    public void increaseSize(int factor) {
        height *=factor;
        width *= factor;
    }

    @Override
    public void decreaseSize(int factor) {
        height/=factor;
        width/=factor;
    }
    public void displaySize(){
        System.out.println("Current size: Height="+ height+" ,Width="+ width);
    }

    public static void main(String[] args) {
        Body body = new Body(10,5);
        body.displaySize();
        body.moveForward(3);
        body.displaySize();
        body.moveBackward(2);
        body.displaySize();
        body.increaseSize(2);
        body.displaySize();
        body.decreaseSize(3);
        body.displaySize();
    }
}