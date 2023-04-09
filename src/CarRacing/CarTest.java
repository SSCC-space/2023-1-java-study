package CarRacing;

import java.util.ArrayList;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        System.out.println("자동차 갯수를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        int carCount = scanner.nextInt();
        int speed;
        String name;

        ArrayList<Car> carArrayList = new ArrayList<>();

        for (int i = 1; i <= carCount; i++) {
            System.out.println(i + "번째 자동차의 스피드를 입력하세요.");
            speed = scanner.nextInt();
            System.out.println(i + "번째 자동차의 이름을 입력하세요.");
            name = scanner.next();

            carArrayList.add(new Car(i, speed, name));
        }

        System.out.println("-----경기 참가자 소개-----");
        for (Car car : carArrayList) {
            car.showInfo();
        }

        scanner.close();
    }
}
