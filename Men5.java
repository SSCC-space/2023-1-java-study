import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Car {
    int speed;
    int score;

    int go(int i) {
        score = score + i;
        return score;
    }

    static void sayScore(int u, int[] i) { //점수 말하기
        System.out.println("---최종 결과 발표---");

        for (int k = 0; k < u; k++) {

            System.out.println("scrore: " + i[k]);
        }

    }

}

class SuperCar extends Car {
    //스피드 두배
    @Override
    int go(int i) {
        i = i * 2;
        super.go(i);
        return score;
    }

//    @Override
//    void sayScore() {
//        super.sayScore(score);
//    }
}

public class Men5 {
    public static void main(String[] args) {
        System.out.println("자동차의 개수를 입력하세요.");
        Scanner car1 = new Scanner(System.in);
        int car2 = car1.nextInt();
        int[] speed = new int[car2];
        String[] name = new String[car2];
        int[] zero = new int[car2];

        for (int i = 0; i < car2; i++) {
            System.out.println((i + 1) + "번째 자동차의 스피드를 입력하세요");
            Scanner speed2 = new Scanner(System.in);
            speed[i] = speed2.nextInt();
            System.out.println((i + 1) + "번째 자동차의 이름을 입력하세요");
            Scanner name2 = new Scanner(System.in);
            name[i] = name2.next();
            System.out.println("이 자동차는 슈퍼카인가요? 0 또는 1 입력");
            Scanner zero1 = new Scanner(System.in);
            zero[i] = zero1.nextInt();

        }
        System.out.println("----경기 참가자 소개----");
        for (int i = 0; i < car2; i++) {
            System.out.println("스피드는" + speed[i] + "이고, 이름은 " + name[i]);
        }
        System.out.println("경기를 몇 초 동안 진행할까요?");
        Scanner sec2 = new Scanner(System.in);
        int sec = sec2.nextInt();

        SuperCar supercar = new SuperCar();
        Car car = new Car();

        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);

        int[] scores = new int[car2];

        for (int i = 0; i < car2; i++) {
            int score = 0;
            for (int t = 0; t < sec; t++) {
                if (rand.nextInt(2) == 1) {
                    if (zero[i] == 1) {
                        if (rand.nextInt(2) == 1) {
                            supercar.go(speed[i]);
                        }

                    }
                    scores[i] = car.go(speed[i]);
                }
            }
        }

        car.sayScore(car2, scores);
    }


}

//스피드만큼 가는게 디폴트 ,, 만약 50%확률로 부스터 실행되면 스피드가 2배임