import java.util.*;

class Car {
    String name;
    int speed;

    Car(int num, String str){
        this.name = str;
        this.speed = num;
    }
    void printCar() {
        System.out.println("스피드는 " + speed + "이고, 이름은 " + name +"입니다.");
    }
}
public class Study_Project2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차의 갯수를 입력하세요.");
        int i = sc.nextInt();
        Car[] cars = new Car[i];
        for (int x = 0; x < i; x++) {
            System.out.println((x+1) + "번 째 자동차의 이름을 입력하세요.");
            String name = sc.next();
            System.out.println((x+1) + "번 째 자동차의 스피드를 입력하세요.");
            int speed = sc.nextInt();
            cars[x] = new Car(speed, name);
        }
        System.out.println("----- 경기 참가자 소개 -----");
        for (Car car : cars) {
            car.printCar();
        }
    }

}
