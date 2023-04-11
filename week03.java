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
public class week03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}
