import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {

       Scanner a = new Scanner(System.in);
        System.out.println("국어점수는?>>");
       int num1 = a.nextInt();
        System.out.println("영어점수는?>>");
       int num2 = a.nextInt();
        System.out.println("수학점수는?>>");
       int num3 = a.nextInt();
        System.out.print((num1+num2+num3)/3);
        a.close();
    }
}