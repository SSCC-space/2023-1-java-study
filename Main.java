import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
class Car{
    protected int speed;
    protected String name;
    protected int score;
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
    public void introduce(){
        System.out.println("스피드는 "+this.getSpeed()+"이고, 이름은 "+this.getName()+"입니다.");
    }
    public void sayScore(){
        System.out.println("score: "+this.getScore());
    }
    public void go(Random rand){
        int handle = rand.nextInt(2);
        if (handle == 1)
            this.score += this.speed;
        else return;
    }
}
class SuperCar extends Car {
    private int boost;
    SuperCar(int speed, String name) {
        super(speed, name);
        this.boost = 0;
    }

    public void go(Random rand) {
        super.go(rand);
        int boost = rand.nextInt(2);
        if (boost == 1) {
            this.score += this.speed;
        }
        this.boost++;
    }
    public void sayScore() {
        super.sayScore();
        System.out.println("booster: "+this.boost);
    }
}
public class Main {
    public static void main(String[] args) {
        int speed;
        String name;
        int superCar;
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
            System.out.println("이 자동차는 슈퍼카인가요? 0 또는 1 입력");
            superCar = sc.nextInt();
            if (superCar==1){
                SuperCar superC = new SuperCar(speed,name);
                cars.add(superC);
            }
            else {
                Car car = new Car(speed, name);
                cars.add(car);
            }
        }
        System.out.println("--참가자 소개--");
        for (Car temp:cars){
            temp.introduce();
        }
        System.out.println("경기를 몇 초 동안 진행할까요?");
        int sec = sc.nextInt();
        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);
        for (int i=0;i<sec;i++){
            for (Car temp:cars){
                temp.go(rand);
            }
        }
        System.out.println("--최종 결과 발표--");
        for(Car temp:cars){
            temp.sayScore();
        }
        sc.close();
    }
}