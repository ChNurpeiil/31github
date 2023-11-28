package w12;

public class Guest {
     static int totalGuests = 0;
     static String hotelName = "";

     int guestId;
     String guestName;
     int age;
     boolean isRegular;

     final int MAX_AGE = 100;
     final int MAX_GUESTS = 100;

    public static String getHotelName(){
        return hotelName;
    }
    public static void setHotelName(String name){
        Guest.hotelName = name;
    }

    public void displayGuestDetails(){
        System.out.println("Guest Details:");
        System.out.println("Guest ID: " + guestId);
        System.out.println("Name: "+ guestName);
        System.out.println("Age: "+ age);
        System.out.println("Regular: "+ isRegular);

    }

    public Guest(int guestId, String guestName, int age, boolean isRegular) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.age = age;
        this.isRegular = isRegular;

        totalGuests++;
    }

    public static void main(String[] args) {
        Guest.setHotelName("ABC Hotel");

        Guest guest1 = new Guest(1, "John Doe", 30, true);
        guest1.displayGuestDetails();
// Guest Details:
// Guest ID: 1
// Name: John Doe
// Age: 30
// Regular: true

        Guest guest2 = new Guest(2, "Jane Smith", 25, false);
        guest2.displayGuestDetails();
// Guest Details:
// Guest ID: 2
// Name: Jane Smith
// Age: 25
// Regular: false

        System.out.println("Total Guests: " + Guest.totalGuests);
// Total Guests: 2
        System.out.println("Hotel Name: " + Guest.getHotelName());
// Hotel Name: ABC Hotel
    }
}
