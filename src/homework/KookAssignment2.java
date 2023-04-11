package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class KookAssignment2 {

    public static void main(String[] args) {
        // 1. 평균점수 구하기
        System.out.println((80+75+55)/3);

        //3.
        String Hong = "881120-1068234";
        System.out.println(Hong.substring(0,6));
        System.out.println(Hong.substring(7,14));

        //5.
        String a = "a:b:c:d";
        System.out.println(a.replace(":","#"));

        //7.
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String separator = " ";
        String result = String.join(separator, myList);
        System.out.println(result);

        //9.
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);

    }

}
