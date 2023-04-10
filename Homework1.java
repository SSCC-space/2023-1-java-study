import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        int count;
        int[] num;
        String[] name;

        Scanner sc = new Scanner(System.in);
        System.out.println("자동차의 갯수를 입력하세요");
        count = sc.nextInt();
        num =  new int[count];
        name = new String[count];

        for(int i=0;i<count;i++) {

            System.out.println( i+1 +"번 째 자동차의 스피드를 입력하세요.");
            num[i] = sc.nextInt();

            System.out.println(i+1 +"번 째 자동차의 이름을 입력하세요");
            name[i] = sc.next();

        }

        System.out.println("-----경기 참가자 소개-----");

        for(int j=0;j<count;j++) {
            System.out.println("스피드는 " + num[j] + "이고," + " 이름은 " + name[j] +"입니다." );
        }

    }

}
