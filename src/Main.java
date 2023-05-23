import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int getRandomDistanceCount(int time){

        int randCount = 0;
        for (int i = 0; i < time ; i++) {
            Random random = new Random(); // 디폴트 시드값 = 현재시간

            if ( random.nextBoolean() ){
                randCount += 1;
            }
        }
        return randCount;
    }

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

            cars[i] = new Car(name, speed);
        }


        System.out.println("------경기 참가자 소개------");
        for (Car car : cars) {
            k = i + 1;

            System.out.println("현재 자동차의 이름과 스피드 출력 " + k + " 번째");
            System.out.println("이름 : " + car.getName() + ", 스피드 : " + car.getSpeed());
        }

        System.out.println("경기를 몇 초 동안 진행될까요??");
        int time = input.nextInt(); // 25 가정

        System.out.println("---최종 결과 발표---");
        for (Car car : cars){
            int distance = car.getSpeed() * getRandomDistanceCount(time);
            System.out.println(car.getName()+ "자동차가 간 거리는 " + distance);
        }

    }


}