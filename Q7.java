import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;

public class Q7 {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life","is","too","short"));
        System.out.println(myList);
        String mymyList= String.join(" ", myList);
        System.out.println(mymyList);
    }
}
