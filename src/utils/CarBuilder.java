package utils;

public interface CarBuilder {
    public CarBuilder name(String name);

    public CarBuilder speed(int speed);

    public CarBuilder isSupercar(int supercar);

    public Car build();
}
