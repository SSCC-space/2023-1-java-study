import java.util.Random;

public class Car {
    private String name;
    private int speed;
    private int score;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.score = 0;
    }
    public String getName(){
        return this.name;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void SetScore(int score) {
        this.score = score;
    }

    public void go(int time){
        for (int i = 0; i < time ; i++) {
            Random random = new Random(); // 디폴트 시드값 = 현재시간

            if ( random.nextBoolean() ){
                this.score += this.speed;
            }
        }
        System.out.println(this.getName() + " /// " + this.score);
    }
}