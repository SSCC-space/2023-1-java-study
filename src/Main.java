import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("자동차의 갯수를 쓰세요");
        int carNums = input.nextInt();

        Car[] cars = new Car[carNums]; // 객체 배열

        int k, i;
        for (i = 0; i < carNums; i++) {
            k = i + 1;

            System.out.println(k + "번째 자동차의 이름을 입력하라");
            String name = input.next(); // 그냥 엔터만 하면 됨

            System.out.println(k + "번째 자동차의 스피드를 입력하라");
            int speed = input.nextInt();

            // 슈퍼가 인지 물어보기
            System.out.println("슈퍼카인가요? Y = 1 , N = 0");
            int isSuper = input.nextInt();
            if (isSuper == 1){
                cars[i] = new SuperCar(name , speed);
                System.out.println("슈퍼카가 생성되었습니다");
            }
            else
                cars[i] = new Car(name, speed);
        }


        // 슈퍼카 부분 참가자 소개
        System.out.println("------경기 참가자 소개------");
        for (Car car : cars) {
            System.out.println("이름 : " + car.getName() + ", 스피드 : " + car.getSpeed());
        }


        System.out.println("경기를 몇 초 동안 진행될까요??");
        int time = input.nextInt(); // 25 가정

        System.out.println("---최종 결과 발표---");
        for (Car car : cars){
            car.go(time);
        }
        // 슈퍼카 부분 결과 발표 //


    }


}