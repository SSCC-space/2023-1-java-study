import java.util.Random;
import java.util.Scanner;

public class Men3_4 {
    public static void main(String[] args) {

        System.out.println("자동차의 개수를 입력하세요");
        Scanner car = new Scanner(System.in);
        int cars = car.nextInt();
        int[] speed = new int[cars];

        String[] name = new String[cars];
        for (int i = 0; i < cars; i++) {
            System.out.println(i + 1 + "번째 자동차의 스피드를 입력하세요");
            Scanner speed1 = new Scanner(System.in);
            speed[i] = speed1.nextInt();

            System.out.println(i + 1 + "번째 자동차의 이름을 입력하세요");
            Scanner name1 = new Scanner(System.in);
            name[i] = name1.next();
        }
        System.out.println("-----경기 참가자 소개-----");
        for (int i = 0; i < cars; i++) {
            System.out.println("스피드는 " + speed[i] + "이고, 이름은 " + name[i]);
        }

        System.out.println("경기를 몇 초 동안 진행할까요?");
        Scanner sec2 = new Scanner(System.in);
        int sec3 = sec2.nextInt();

        long seed = System.currentTimeMillis();
        Random move1 = new Random(seed);

        System.out.println(sec3);
        int[] scores = new int[cars];

        for (int i = 0; i < cars; i++) {
            int score = 0;
            for (int t = 0; t < sec3; t++) {
                if (move1.nextInt(2) == 1) {
                    score = score + speed[i];
                    scores[i] = score;
                }
            }
        }

        System.out.println("---최종 결과 발표---");
        for (int i = 0; i < cars; i++) {
            System.out.println("점수: " + scores[i]);
        }
    }

}
