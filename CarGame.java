package JavaStudy;
import java.util.*;

public class CarGame {
    int number;
    String [] name;
    int [] speed;


    public void introduce(){

       System.out.println("자동차의 개수를 입력하세요");
       Scanner sc = new Scanner(System.in);
       number = sc.nextInt();
       System.out.println(number);
       String [] name = new String[number];
       int [] speed = new int[number];

       for(int i=1;i<=number;i++) {
           System.out.println(i + "번째 자동차의 이름을 입력하세요");
           name[i - 1] = sc.next();
           System.out.println(i + "번째 자동차의 속도를 입력하세요");
           speed[i - 1] = sc.nextInt();
       }
       System.out.println("-------------경기 참가자 소개------------------");
       for(int x=1;x<=name.length; x++) {
           System.out.println("스피드는" + speed[x - 1] + "이고, 이름은 " + name[x - 1] + "입니다");
            }
       }
    public static void main(String[]args){
        CarGame game= new CarGame();
        game.introduce();
    }

}
