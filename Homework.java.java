import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Homework {
//    Q1. 평균점수 구하기
//    홍길동 씨의 과목별 점수는 다음과 같다. 홍길동 씨의 평균 점수를 구해 보자.
//
//    과목	점수
//    국어	80
//    영어	75
//    수학	55

//    Q3. 주민등록번호 나누기
//    홍길동 씨의 주민등록번호는 881120-1068234이다. 홍길동 씨의 주민등록번호를 연월일(YYYYMMDD) 부분과 그 뒤의 숫자 부분으로 나누어 출력해 보자.
//
//    문자열의 substring을 사용해 보자.

//    Q5. 문자열 바꾸기
//    다음과 같은 문자열 a:b:c:d가 있다. 문자열의 replace 함수를 사용하여 a#b#c#d로 바꿔서 출력해 보자.
//
//    String a = "a:b:c:d";

//    Q7. 리스트를 문자열로 만들기
//    다음과 같은 ['Life', 'is', 'too', 'short'] 리스트를 "Life is too short" 문자열로 만들어 출력해 보자.
//
//            import java.util.ArrayList;
//import java.util.Arrays;
//
//    public class Sample {
//        public static void main(String[] args) {
//            ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
//            System.out.println(myList); // [Life, is, too, short] 출력
//        }
//    }
//    문자열의 join 메서드를 사용해 보자.

//    Q9. 중복 숫자 제거하기
//    다음의 numbers 리스트에서 중복 숫자를 제거해 보자.
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//    public class Sample {
//        public static void main(String[] args) {
//            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
//            System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력
//        }
//    }
//    집합 자료형의 요솟값이 중복될 수 없다는 특징을 사용해 보자.


    public static void main(String[] args) {

        //1번
        System.out.println((80 + 75 + 55) / 3);

        //3번
        String citizenNumber = "881120-1068234";
        System.out.println(citizenNumber.substring(0, 6));
        System.out.println(citizenNumber.substring(7, 14));

        //5번
        String a = "a:b:c:d";
        System.out.println(a.replace(":", "#"));

        //7번
        ArrayList<String> mylist = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", mylist);
        System.out.println(result);

        //9번
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(set);

    }
}