package w12;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private List<Room> rooms;

    public House(String address) {

        this.address = address;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public Room getRoom(int roomNumber){
        for (Room room:rooms){
            if (room.getRoomNumber() == roomNumber){
                return room;
            }
        }
        return null;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
class Room{
    private int roomNumber;
    private Door door;
    private Window window;

    public Room(int roomNumber, Door door, Window window) {
        if (roomNumber > 0) {
            this.roomNumber = roomNumber;
        }else{
            System.out.println("Room number must be a positive integer.");
        }
        this.door = door;
        this.window = window;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
       if (roomNumber > 0) {
           this.roomNumber = roomNumber;
       }else{
           System.out.println("Room number must be a positive integer.");
       }
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }
}
class Door{
    private String color;

    public Door(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Window{
    private String type;

    public Window(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        House house = new House("123 Main St.");

        Room room1 = new Room(1,new Door("White"), new Window("Glass"));
        Room room2 = new Room(2, new Door("Black"), new Window("Glass"));
        Room room3 = new Room(3, new Door("Gold"), new Window("Glass"));

        house.addRoom(room1);
        room2.setRoomNumber(-1);
        house.addRoom(room2);


        System.out.println("House Address: "+ house.getAddress());

        System.out.println("Room Number: "+ room1.getRoomNumber());
        System.out.println("Room Door Color: "+ room1.getDoor().getColor());
        System.out.println("Room Window Type: "+ room1.getWindow().getType());

        System.out.println("Room Number: "+ room2.getRoomNumber());
        System.out.println("Room Door Color: "+ room2.getDoor().getColor());
        System.out.println("Room Window Type: "+ room2.getWindow().getType());
    }
}


