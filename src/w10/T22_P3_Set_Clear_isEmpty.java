package w10;

import java.util.HashSet;
import java.util.Set;

public class T22_P3_Set_Clear_isEmpty {
    private static Set<String> wishlist = new HashSet<>();

    public static void addGift(String gift){
        wishlist.add(gift);
    }
    public static int getSize(){
        return  wishlist.size();
    }
    public static void clearWishList(){
         wishlist.clear();
    }
    public static  boolean isWishListEmpty(){
       return wishlist.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(getSize());

        addGift("Toy");
        addGift("Book");
        addGift("Candle");

        System.out.println(isWishListEmpty());
        System.out.println(getSize());

        clearWishList();

        System.out.println(getSize());
        System.out.println(isWishListEmpty());
    }
}
