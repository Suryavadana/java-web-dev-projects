package technology;

public class Program {
    public static void main(String[] args) {
        //JUnit Tests
        Computer computer =new Computer("Dell","Inspiron", 999.99);
        System.out.println("Computer Model: " + computer.getModel());
        System.out.println("Computer Brand: " + computer.getBrand());
        System.out.println("Computer Price: " + computer.getPrice());
        computer.turnOn();

        Laptop laptop = new Laptop("Apple", "MacBookPro", 1999.99, 14);
        System.out.println("Laptop Model: "+ laptop.getModel());
        System.out.println("Laptop Brand: "+ laptop.getBrand());
        System.out.println("Laptop Price: "+ laptop.getPrice());
        System.out.println("Laptop Screensize: "+ laptop.getScreenSize());
        laptop.turnOn();
        laptop.connectWifi();

        SmartPhone smartphone = new SmartPhone("S23","Samsung", 399.99, "TMobile");
        System.out.println("SmartPhone Model: " + smartphone.getModel());
        System.out.println("SmartPhone Brand: "+ smartphone.getBrand());
        System.out.println("SmartPhone Price: " +smartphone.getPrice());
        System.out.println("SmartPhone NetWork: "+smartphone.getNetWork());
        smartphone.turnOn();
        smartphone.makeCall("123 456 7890");


    }

}
