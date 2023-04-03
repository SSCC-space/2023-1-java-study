import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solve {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>(); //1번 풀이
        map.put("국어", 80);
        map.put("영어", 75);
        map.put("수학", 55);

        int aver = ((map.get("국어")+ map.get("영어")+ map.get("수학")) / 3);
        System.out.println(aver);

        int a = 80; //1번 풀이
        int b = 75;
        int c = 55;
        System.out.println((a+ b + c)/3);


        String three="881120-1068234"; //3번 풀이
        System.out.println(three.substring(0,6));
        System.out.println(three.substring(7,14));

        String five = "a:b:c:d"; //5번 풀이
        System.out.println(five.replaceAll(":","#"));

        ArrayList<String> seven = new ArrayList<>(Arrays.asList("life","is","too","short")); //7번 풀이
        System.out.println(seven);
        String result = String.join(" ",seven);
        System.out.println(result);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5)); // 9번 풀이
        HashSet<Integer> numbers1 = new HashSet<>(numbers);
        ArrayList<Integer> numbers2 = new ArrayList<>(numbers1);
        System.out.println(numbers2);




    }
}
