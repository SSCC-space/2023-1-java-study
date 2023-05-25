import java.util.Scanner;

class Member{
    int speed;
    String name;

    public Member(){}



}
public class Participants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("참가자 수 입력 (2명 이상): ");
        int num = scanner.nextInt();

        Member[] m = new Member[num];

        for (int i = 0; i < num; i++) {
            m[i] = new Member();
        }

        for (int i = 0; i < num; i++) {
            System.out.print(i+1+"번째 참가자의 스피드를 입력하세요.\n");
            m[i].speed = scanner.nextInt();
            System.out.print(i+1+"번째 참가자의 이름을 입력하세요.\n");
            m[i].name = scanner.next();
            System.out.print("\n");
        }
        System.out.print("-----경기 참가자 소개-----\n");
        for (int i = 0; i < num; i++) {
            System.out.print("스피드는 "+m[i].speed+"이고, 이름은 "+m[i].name+"입니다.\n");
        }




    }
}
