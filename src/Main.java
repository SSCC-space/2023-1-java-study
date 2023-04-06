import java.util.Scanner;


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

            cars[i] = new Car(name, speed);
        }


        System.out.println("------경기 참가자 소개------");
        for (i = 0; i < cars.length; i++) {
            k = i + 1;

            System.out.println("현재 자동차의 이름과 스피드 출력 " + k + " 번째");
            System.out.println("이름 : " + cars[i].getName() + ", 스피드 : " + cars[i].getSpeed());
        }


    }
}