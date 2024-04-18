package technology;

public class Computer {
    protected String model;
    protected String brand;
    protected double price;

    public Computer(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void turnOn() {
        System.out.println("Computer is now turned on.");
    }
}
