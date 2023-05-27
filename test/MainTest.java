import org.junit.jupiter.api.*;
import utils.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private static Main main;
    private static Car[] cars;
    private static RacingGame game;


    @BeforeAll
    static void initTest() {
        game = new RacingGame();
        cars = new Car[]{
                new SuperCar("A", 1),
                new NormalCar("B", 2)};
    }

    @Test
    @DisplayName("자동차 등록 및 크기 확")
    void getSizeOfCars() {
        game = new RacingGame();
        int totalCount = cars.length;

        for (Car car : cars) {
            game.addRacingCar(car);
        }

        game.broadcastCars();
        assertEquals(game.getSizeOfCars(), totalCount);
    }

    @Test
    @DisplayName("게임 시작 및 게임 결과 확인")
    void startRacing() {
        for (Car car : cars) {
            game.addRacingCar(car);
        }

        game.toRacing(10);
        game.broadcastResult();
    }
}