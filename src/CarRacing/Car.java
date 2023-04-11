package CarRacing;

public class Car {
    int carNum;
    int carSpeed;
    String carName;

    public Car(int carNum, int carSpeed, String carName) {
        this.carNum = carNum;
        this.carSpeed = carSpeed;
        this.carName = carName;
    }

    public void showInfo(){
        System.out.println("스피드는 "+carSpeed + "이고, 이름은 " + carName +"입니다.");
    }
}