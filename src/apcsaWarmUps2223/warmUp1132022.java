package apcsaWarmUps2223;
import java.util.ArrayList;
public class warmUp1132022 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nathaniel Galan");
        list.add("Alejandro Garza");
        list.add("Ethan Gomez");
        list.add("Kristian Lopez");
        list.add("Sebastian Martinez");
        list.add("Trent Shelton");
        list.add("Christopher Suarez");
        list.add("Muammer Suslu");
        System.out.println("Contents of the array list: ");
        for (String element : list) {
            if (element.contains("ahmet")) {
                System.out.println(element);
            }
        }
    }
}