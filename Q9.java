import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q9 {
    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
        HashSet<Integer> set = new HashSet<Integer>(numbers);
        ArrayList<Integer> result = new ArrayList<>(set);
        System.out.println(result);

    }
}
