import java.util.Scanner;
public class Average {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello");
        double input1;
        double input2;
        double input3;
        double result;
        input1 = scanner.nextDouble();
        input2 = scanner.nextDouble();
        input3 = scanner.nextDouble();
        result = (input1+input2+input3)/3;
        System.out.println(result);
    }
}
