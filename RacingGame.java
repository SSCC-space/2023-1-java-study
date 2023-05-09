import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Car {
    int speed;
    String name;

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

}

public class RacingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1단계 : 참가자 소개 기능

        System.out.print("참가자 수 입력 (2명 이상): ");
        int num = scanner.nextInt();
        System.out.print("\n");

        Car[] c = new Car[num];

        ArrayList<Car> car = new ArrayList<>();

        for (int i = 0; i < num; i++) {

            // c[i] = new Car();

            System.out.print(i + 1 + "번째 참가자의 스피드 입력 : ");
            int speed = scanner.nextInt();
            System.out.print(i + 1 + "번째 참가자의 이름 입력 : ");
            String name = scanner.next();
            System.out.print("\n");

            c[i] = new Car(speed, name);
            car.add(c[i]);

        }

        System.out.print("-----경기 참가자 소개-----\n");
        for (Car car2 : car) {
            System.out.print("스피드는 " + car2.speed + "이고, 이름은 " + car2.name + "입니다.\n");
        }

        // 2단계 : 자동차 경주 규칙

        System.out.println("\n");
        System.out.println("경기를 몇 초 동안 진행할까요?");
        int time = scanner.nextInt();

        Random random = new Random();
        
        System.out.println("\n---최종 결과 발표---\n");
        
        for (Car car3 : car) {
            int score=0;
            
            for (int i = 0; i < time; i++) {
                int move = random.nextInt(2);
                if(move==1){
                    score += move*car3.speed;
                }else{
                    continue;
                }
            }
            System.out.println(car3.name +" : "+score);
        }

    }
}
