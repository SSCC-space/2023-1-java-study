import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class chap03_9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        //System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력
        HashSet<Integer> hashSet=new HashSet<>();
        for(Integer num:numbers) {
            hashSet.add(num);
        }
        System.out.println(hashSet);
    }
}
