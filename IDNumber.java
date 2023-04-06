import java.util.Scanner;

public class IDNumber {
    public static void main(String args[]){
        String iD;
        String yearMonthDay;//나중에 따로 저장해서 시도해 볼 것
        Scanner scanner = new Scanner(System.in);
        iD = scanner.nextLine();
        System.out.println(iD.substring(0,6));
        System.out.println(iD.substring(7,14));
    }
}
