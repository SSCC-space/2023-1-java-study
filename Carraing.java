import javax.naming.Name;
import java.util.Scanner;

public class Carracing {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("참가자 수를 입력하세요 : ");
        int numNameandspeed = scanner.nextInt();
        scanner.nextLine();

        Nameandspeed[] nameandspeeds = new Nameandspeed[numNameandspeed];
        for (int i = 0; i < numNameandspeed; i++) {
            int idx = i + 1;
            System.out.println(idx + "번째 참가자의 이름을 입력해주세요");
            String name = scanner.nextLine();

            System.out.println(idx + "번째 참가자의 속도를 입력해주세요");
            int speed = scanner.nextInt();

            scanner.nextLine();

            Nameandspeed nameandspeed = new Nameandspeed(name, speed);
            nameandspeeds[i] = nameandspeed;
        }

        System.out.println("---참가자 소개---");
        for (int k = 0; k < numNameandspeed; ++k) {
            int kdx = k + 1;
            System.out.println(kdx + "번째 참가자의 이름은 " + nameandspeeds[k].getName() + " 스피드" + nameandspeeds[k].getSpeed());


        }

        scanner.close();


    }


}
