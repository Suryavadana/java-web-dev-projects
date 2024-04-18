package technology;

public class Laptop extends Computer{
    protected double screenSize;

    public Laptop(String model, String brand, double price, double screenSize) {
        super(model, brand, price);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void connectWifi(){
        System.out.println("Laptop connected to Wifi.");
    }
}
