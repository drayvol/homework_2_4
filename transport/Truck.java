package transport;

public class Truck extends Transport implements Competing {
    private final Integer pitStopTime;
    private final Integer bestLapTime;
    private final Integer maxSpeed;


    public Truck(String brand, String model, Double engineVolume,
                 Integer pitStopTime, Integer bestLapTime, Integer maxSpeed) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
    }
    @Override
    void start() {System.out.println("Грузовик поехал");}

    @Override
    void finish() {System.out.println("Грузовик приехал");}
    @Override
    public void getPitStop() {
        System.out.println("Пит стоп" +pitStopTime);
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга"+bestLapTime);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость" + maxSpeed);
    }
}
