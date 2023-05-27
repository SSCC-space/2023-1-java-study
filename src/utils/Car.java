package utils;

public interface Car {
    String name = "";
    int speed = 0;

    public String getName();

    public int getSpeed();

    public void describe();

    public default void go(int time) {
        for (int i = 0; i < time; i++) {
            this.move();
        }
    }

    void move();

    public void printResult();
}
