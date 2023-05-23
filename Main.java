import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
class Car{
    private int speed;
    private String name;
    private int score;
    Car(int speed,String name){
        this.speed = speed;
        this.name = name;
        this.score = 0;
    }
    public int getSpeed(){
        return this.speed;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    public void randomSco(Random rand){
        int handle = rand.nextInt(2);
        System.out.println(handle);
        if (handle == 1)
            this.score += this.speed;
        else return;
    }
}
public class Main {
    public static void main(String[] args) {
        int speed;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("자동차의 갯수를 입력하세요>>");
        int num = sc.nextInt();
        ArrayList<Car> cars = new ArrayList<>();
        for (int i=0;i<num;i++)
        {
            System.out.print((i+1)+"번째 차의 스피드를 입력하세요>>");
            speed = sc.nextInt();
            System.out.print((i+1)+"번째 차의 이름을 입력하세요>>");
            name = sc.next();
            Car car = new Car(speed,name);
            cars.add(car);
        }
        System.out.println("--참가자 소개--");
        for (Car temp : cars){
            System.out.println("스피드는 "+temp.getSpeed()+"이고, 이름은 "+temp.getName()+"입니다.");
        }
        System.out.println("경기를 몇 초 동안 진행할까요?");
        int sec = sc.nextInt();
        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);
        for (int i=0;i<sec;i++){
            for (Car temp:cars){
                temp.randomSco(rand);
            }
        }
        sc.close();
        System.out.println("--최종 결과 발표--");
        for(Car temp:cars){
            System.out.println(temp.getScore());
        }

    }
}