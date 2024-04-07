package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create a new Menu
        Menu menu = new Menu();

        // Create some menu items

        MenuItem menuItem1 = new MenuItem("Chocolate Brownie Sundae", 6.99, "Warm chocolate brownie topped with vanilla ice cream, whipped cream, and chocolate syrup", "Dessert");

        // Add menu items to the menu

        menu.addMenuItem(menuItem1);

        // Display the menu
        System.out.println("Menu last updated: " + menu.getLastUpdated());
        menu.displayMenu();
    }

}
