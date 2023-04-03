import java.util.ArrayList;
import java.util.Arrays;

public class Num7 {
    //리스트를 문자열로 만들기
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life","is","too","short"));
        String str = String.join(" ",myList);

        System.out.print(str);



    }
}
