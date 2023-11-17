package w10;

import java.util.ArrayList;
import java.util.List;

public class T12_P3_Array_List_Cet_Method {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("Song1", "Song2", "Song3", "Song4", "Song5"));
        System.out.println(getCurrentSong(list, 2));
        System.out.println(getCurrentSong(list,4));
    }
    public static String getCurrentSong(List<String> songsPlayList, int index){
        String str = songsPlayList.get(index);
        return str;
    }
}
