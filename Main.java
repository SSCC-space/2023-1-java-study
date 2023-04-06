import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //1번 문제
        int avg=(80+75+55)/3;
        System.out.println(avg);

        //3번 문제
        String number = "881120-1068234";
        //String a = number.substring(0,5);
        //String b = number.substring(6,12);
        System.out.println(number.substring(0,6));
        System.out.println(number.substring(7,14));

        //5번 문제
        String c = "a:b:c:d";
        c=c.replace(":","#");
        System.out.println(c);

        //7번 문제
        ArrayList myList = new ArrayList(); //()안에는 못 쓰는지?
        myList.add("Life");
        myList.add("is");
        myList.add("too");
        myList.add("short");
        System.out.println(myList);

        //9번 문제
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> numberss = new HashSet(numbers);       //어려워요 ㅠㅠ
        ArrayList<Integer> result = new ArrayList<>(numberss);
        System.out.println(result);


    }
}