import javax.naming.Name;
import java.util.Scanner;

public class Carracing {
    private static Scanner scanner = new Scanner(System.in); //스캐너 불러오기

    public static void main(String[] args) {

        System.out.println("경기에 참여하는 자동차의 수를 입력하세요 : ");
        int numNameandspeed = scanner.nextInt(); //자동차의 수 받기
        scanner.nextLine();

        Nameandspeed[] nameandspeeds = new Nameandspeed[numNameandspeed]; //객체배열 선언
        for (int i = 0; i < numNameandspeed; i++) { //for문을 돌면서 자동차의 이름과 속도를 받기
            int idx = i + 1;
            System.out.println(idx + "번째 자동차의 이름을 입력해주세요");
            String name = scanner.nextLine(); //이름 받기

            System.out.println(idx + "번째 자동차의 속도를 입력해주세요");
            int speed = scanner.nextInt(); //속도 받기

            scanner.nextLine();

            nameandspeeds[i] = new Nameandspeed(name, speed); //받은 정보들을 객체로서 배열에 담기
        }

        System.out.println("---참가자 소개---");
        for (int k = 0; k < numNameandspeed; ++k) {
            int kdx = k + 1;
            System.out.println(kdx + "번째 참가자의 이름은 " + nameandspeeds[k].getName() + " 스피드" + nameandspeeds[k].getSpeed()); //Nameandspeed 클래스 매소드 활용해 출력


        }

        scanner.close(); //스캐너 닫기


    }


}
