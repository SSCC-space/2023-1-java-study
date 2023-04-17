package CarRacing;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        System.out.println("자동차 갯수를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        int carCount = scanner.nextInt();
        int speed;
        String name;
        int racingTime;
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        int distance;

        ArrayList<Car> carArrayList = new ArrayList<>();

        for (int i = 1; i <= carCount; i++) {
            System.out.println(i + "번째 자동차의 스피드를 입력하세요.");
            speed = scanner.nextInt();
            System.out.println(i + "번째 자동차의 이름을 입력하세요.");
            name = scanner.next();
            carArrayList.add(new Car(i, speed, name));
        }

        System.out.println("\n-----경기 참가자 소개-----");
        for (Car car : carArrayList) {
            car.showInfo();
        }

        System.out.println("\n경기를 몇 초 동안 진행할까요?");
        racingTime = scanner.nextInt();

        System.out.println("\n---최종 결과 발표---");

        for (Car car : carArrayList) {
            distance = 0;
            for (int i = 0; i < racingTime; i++) {
                distance = distance + (car.carSpeed * random.nextInt(2));
            }
            System.out.println("distance = " + distance);
        }


        scanner.close();
    }
}
