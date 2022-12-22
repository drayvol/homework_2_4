package transport;

import static validate.Validate.validateString;

public abstract class Transport {
    private final String brand;
    private final String model;
    private Double engineVolume;


    public Transport(String brand, String model, Double engineVolume) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        if (engineVolume == null) this.engineVolume=1.5;
        else this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public static String validateCarParameters(String value){return validateString(value,"не указано");}
    abstract void start();
    abstract void finish();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
