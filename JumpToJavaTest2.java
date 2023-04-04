//comment 보고 수정 후 재업로드 합니당
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class JumpToJavaTest2 {
    public static void main(String[] args) {
        //문제 1번
        int korean = 80;
        int english = 75;
        int math = 55;
        double average = 0.0;
        average = ((korean + english + math) / 3);
        System.out.println("평균은 : " + average);
        //문제3번
        String a = "881120-1068234";
        System.out.print("생년월일 : 19" + a.substring(0, 6));
        System.out.println(", 뒷 주민등록번호 : " + a.substring(7, 14));
        //문제5번(질문 있습니당)
        String b = "a:b:c:d";
        System.out.println(b.replaceAll(":", "#")); //replace와 replaceAll의 결과 값이 같은데 차이점이 있을까용?
        //문제9번
        ArrayList<String> myList = new ArrayList(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList);
        System.out.println(result);
        HashSet<Integer> set = new HashSet(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(set);
    }
}