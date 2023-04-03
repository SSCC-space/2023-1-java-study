package sec01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Work01 {

	public static void main(String[] args) {
		//01 평균 점수 구하기
		int k=80;
		int y=75;
		int s=55;
		System.out.println((k+y+s)/3);
		//03 주민등록번호 나누기
		String p="881120-1068234";
		String YYYYMMDD=p.substring(0,6);
		String num=p.substring(7,14);
 System.out.println(YYYYMMDD);
 System.out.println(num);
        //05 문자열 바꾸기
        String a="a:b:c:d";
        String b=a.replaceAll(":","#");
        System.out.println(b);
        //07 리스트를 문자열로 만들기
        ArrayList<String>myList=new ArrayList<>(Arrays.asList("Life","is","too","short"));
        String Man=String.join("",myList);
        System.out.println(Man);
        //09 중복숫자 제거하기
        ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
        HashSet<Integer>alte=new HashSet(numbers);
        ArrayList<Integer>fin=new ArrayList<>(alte);
        System.out.println(fin);
		
		
	}

}
