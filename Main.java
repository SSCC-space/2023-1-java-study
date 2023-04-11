import java.util.ArrayList;
import java.util.Scanner;
class Car{
    int speed;
    String name;
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차의 갯수를 입력하세요>>");
        int num = sc.nextInt();
        ArrayList<Car> cars = new ArrayList<>();
        for (int i=0;i<num;i++)
        {
            Car car = new Car();
            cars.add(car);
            System.out.println((i+1)+"번째 차의 스피드를 입력하세요>>");
            car.speed = sc.nextInt();
            System.out.println((i+1)+"번째 차의 이름을 입력하세요>>");
            car.name = sc.next();
        }
        System.out.println("--참가자 소개--");
        for (Car temp : cars){
            System.out.println("스피드는 "+temp.speed+"이고, 이름은 "+temp.name+"입니다.");
        }

    }
}