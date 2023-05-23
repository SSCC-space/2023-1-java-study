package CarRacing;

import java.util.ArrayList;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int carCount;
        int speed;
        String name;
        int racingTime;
        int superCarFlag;

        ArrayList<Car> carArrayList = new ArrayList<>();

        System.out.println("자동차 갯수를 입력하세요.");
        carCount = scanner.nextInt();


        for (int i = 1; i <= carCount; i++) {
            System.out.println(i + "번째 자동차의 스피드를 입력하세요.");
            speed = scanner.nextInt();
            System.out.println(i + "번째 자동차의 이름을 입력하세요.");
            name = scanner.next();

            System.out.println("이 자동차는 슈퍼카인가요? 0또는 1입력");
            superCarFlag = scanner.nextInt();
            if (superCarFlag == 0) {
                carArrayList.add(new Car(speed, name));
            } else if (superCarFlag == 1) {
                carArrayList.add(new SuperCar(speed, name));
            }
        }

        System.out.println("\n-----경기 참가자 소개-----");
        for (Car car : carArrayList) {
            car.showInfo();
        }

        System.out.println("\n경기를 몇 초 동안 진행할까요?");
        racingTime = scanner.nextInt();

        System.out.println("\n---최종 결과 발표---");

        for (Car car : carArrayList) {
            for (int i = 0; i < racingTime; i++) {
                car.go();
            }
            car.sayScore();
        }
        scanner.close();
    }
}
