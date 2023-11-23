package w11;

import java.util.Map;

public class T12_P3_ValuesMethod {
    public static void main(String[] args) {

       Map<String, String> attendanceList = Map.of("Student1", "2023-10-20", "Student2", "2023-10-05", "Student3", "2023-10-05");
        String s = "2023-10-05";
        System.out.println(countPresentOnDate(attendanceList, s));
    }
    public static int countPresentOnDate(Map<String, String> attendanceList, String date){
        int count =0;

        for (String recordDate: attendanceList.values()){
            if (recordDate.equals(date)){
                count++;
            }
        }
        return count;
    }
}
