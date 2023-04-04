import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    String s = a.next();
        System.out.print(s.substring(0,6)+"과"+s.substring(7,14));
        a.close();

    }
}
