import utils.Car;
import utils.CarBuilder;

public class DefaultCarBuilder implements CarBuilder {
    String name;
    int speed;
    boolean isSupercar;

    public DefaultCarBuilder() {
    }

    public DefaultCarBuilder name(String name) {
        this.name = name;
        return this;
    }

    public DefaultCarBuilder speed(int speed) {
        this.speed = speed;
        return this;
    }

    public DefaultCarBuilder isSupercar(int supercar) {
        isSupercar = supercar == 1;
        return this;
    }

    public Car build() {
        if (isSupercar) {
            return new SuperCar(this.name, this.speed);
        }
        return new NormalCar(this.name, this.speed);
    }
}
