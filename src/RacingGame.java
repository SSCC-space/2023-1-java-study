import utils.Car;

import java.util.ArrayList;

public class RacingGame {
    private int sizeOfCars;
    private ArrayList<Car> cars = new ArrayList<Car>();

    public RacingGame() {
    }

    public int getSizeOfCars() {
        return cars.size();
    }

    public void addRacingCar(Car car) {
        cars.add(car);
    }

    public void toRacing(int time) {
        for (Car car : cars) {
            car.go(time);
        }
    }

    public void broadcastCars() {
        for (Car car : cars) {
            car.describe();
        }
    }

    public void broadcastResult() {
        for (Car car : cars) {
            car.printResult();
        }
    }


}
