package transport;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "1", 1.8, 10, 23, 33);
        System.out.println(tesla);
        DriverB<Car> driver = new DriverB<>("Петя",true, 20);
        System.out.println(driver.getCarMessage(tesla));

    }
}