import utils.Car;
import utils.MessageEnum;

import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static int getSizeOfCars() {
        MessageEnum.INIT_CARS.printMessage();
        return input.nextInt();
    }

    public static Car makeCar() {
        MessageEnum.INPUT_NAME.printMessage(); // [ System ] 해당 자동차의 이름을 입력해주세요. (type: String)
        String name = input.next();
        MessageEnum.INPUT_SPEED.printMessage(); // [ System ] 해당 자동차의 속도를 입력해주세요. (type: integer)
        int speed = input.nextInt();
        MessageEnum.INPUT_IS_SPUERCAR.printMessage(); // [ System ] 해당 자동차는 SuperCar 인가요? (True = 1, False = 0)
        int isSupercar = input.nextInt();

        return new DefaultCarBuilder()
                .name(name)
                .speed(speed)
                .isSupercar(isSupercar)
                .build();
    }

    public static int getLoopTime() {
        MessageEnum.GAME_TIME.printMessage();
        return input.nextInt();
    }

    public static void main(String[] args) {
        int sizeOfCars = getSizeOfCars();
        RacingGame game = new RacingGame();

        for (int count = 0; count < sizeOfCars; count++) {
            MessageEnum.NUMBER_OF_CAR.getNumberOfCars(count + 1, sizeOfCars); // [i/n] ==========
            game.addRacingCar(makeCar());
        }

        game.broadcastCars();
        game.toRacing(getLoopTime());
        game.broadcastResult();
    }
}