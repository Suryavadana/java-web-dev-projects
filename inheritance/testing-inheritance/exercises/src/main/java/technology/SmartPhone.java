package technology;

public class SmartPhone extends Computer{

    protected String netWork;

    public SmartPhone(String model, String brand, double price, String netWork) {
        super(model, brand, price);
        this.netWork = netWork;
    }

    public String getNetWork() {
        return netWork;
    }

    public void makeCall(String number)
    {
        System.out.println("Calling" + number +"...");
    }
}
