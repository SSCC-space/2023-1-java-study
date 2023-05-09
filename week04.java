import java.util.Random;
import java.util.Scanner;
class Car{
    int speed;
    String name;
    Car(int speed,String name)
    {
        this.speed=speed;
        this.name=name;
    }
}
public class week04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        int speed;
        String name;
        System.out.println("자동차의 갯수를 입력하세요.");
        int cnt=scanner.nextInt();
        Car []num=new Car[3];
        for(int i=0;i<cnt;i++)
        {
            System.out.println(i+1+"번 째 자동차의 스피드를 입력하세요.");
            speed=scanner.nextInt();
            System.out.println(i+1+"번 째 자동차의 이름을 입력하세요.");
            name=scanner.next();
            num[i]=new Car(speed,name);
        }
        System.out.println("-----경기 참가자 소개-----");
        for(int i=0;i<cnt;i++)
        {
            System.out.println("스피드는 "+num[i].speed+"이고, 이름은 "+num[i].name+"입니다.");
        }
        System.out.println();
        System.out.println("경기를 몇 초 동안 진행할까요?");
        int sec=scanner.nextInt();
        int score[]={0,0,0};
        for(int j=0;j<cnt;j++)
        {
            for(int k=0;k<sec;k++)
            {
                score[j]+=random.nextInt(2)*num[j].speed;
            }
        }
        System.out.println();
        System.out.println("---최종 결과 발표---");
        for(int j=0;j<cnt;j++)
        {
            System.out.println(score[j]);
        }
    }
}
