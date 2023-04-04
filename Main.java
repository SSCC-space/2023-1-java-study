package JavaStudy;
import java.util.*;

public class Main {

    private int korean =80;
    private int english =75;
    private int math=55;
    private String hong ="881120-1068234";
    private String a= "a:b:c:d";

    public void first(){
        System.out.println("3-1의 답은?");
        System.out.println((korean+english+math)/3);

    }
    public void second(){
        System.out.println(hong.substring(0,6));
        System.out.println(hong.substring(7,14));

    }
    public void third(){
        System.out.println(a.replaceAll(":","#"));
    }
    public void fourth(){
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life","is","too","short"));
        String result= String.join(" ",myList);
        System.out.println(result);

    }
    public void fifth(){
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
        HashSet<Integer> num=new HashSet<>(numbers);
        ArrayList<Integer> NewList = new ArrayList<>(num);
        System.out.println(NewList);
    }

    public static void main (String[]args) {
        Main homeWork = new Main();
        homeWork.first();
        homeWork.second();
        homeWork.third();
        homeWork.fourth();
        homeWork.fifth();

    }


}
