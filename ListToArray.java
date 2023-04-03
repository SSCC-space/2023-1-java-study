import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
    public static void main(String argc[]){

        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList); // [Life, is, too, short] 출력
        String string = "";
        for (String item : myList) {
            string += item + " ";
        }
        System.out.println(string);
    }
}
