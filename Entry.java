import java.util.Scanner;

public class Entry {
    int speed;
    String name = "";

    public static void main(String args[]) {
        int entryNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("참가자 수를 입력하세요.");
        entryNumber = scanner.nextInt();
        Entry[] entryArray = new Entry[entryNumber];
        for (int a = 0; a < entryNumber; a++) {
            entryArray[a] = new Entry();
            System.out.println(a + 1 + "번째 참가자의 speed를 입력하세요.");
            entryArray[a].speed = scanner.nextInt();
            System.out.println(a + 1 + "번째 참가자의 이름를 입력하세요.");
            entryArray[a].name = scanner.next();
        }
        System.out.println("---------참가자 소개----------");
        for (int a = 0; a < entryNumber; a++) {
            System.out.println("speed : " + entryArray[a].speed + "     name : " + entryArray[a].name);
        }
    }
}
