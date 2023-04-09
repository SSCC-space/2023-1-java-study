import java.util.ArrayList;
import java.util.Scanner;

public class SsccJava3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*String name = scanner.nextLine();
        int count = scanner.nextInt();

        System.out.println(name);
        System.out.println(count);*/

        System.out.println("자동차의 개수를 입력하세요.");
        int count = scanner.nextInt();
        //int carSpeed;
        //String carName;
        ArrayList carSpeed = new ArrayList();
        ArrayList<String> carName = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            System.out.println(i + "번째 자동차의 스피드를 입력하세요.");
            int speed = scanner.nextInt();
            scanner.nextLine();
            System.out.println(i + "번째 자동차의 이름을 입력하세요.");
            String name = scanner.nextLine();
            carSpeed.add(speed);
            carName.add(name);
        }

        scanner.close();

        System.out.println("\n-----경기 참가자 소개-----");
        for (int i = 1; i <= count; i++) {
            System.out.println("스피드는 " + carSpeed.get(i-1) + "이고, 이름은 " + carName.get(i-1) + "입니다.");
        }
    }
}
