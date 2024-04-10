package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Menu menu =new Menu();
        // Create some menu items

        MenuItem menuItem1 = new MenuItem(3,"abcd", "efg",true);
        MenuItem menuItem2 = new MenuItem(2,"qwerty", "uiop", true);
        MenuItem menuItem3 = new MenuItem(4,"asdfg","hjkl",true);


        // Add menu items to the menu

        menu.addMenuItem(menuItem1);
        menu.removeMenuItem(menuItem3);

        // Display the menu
        System.out.println("Menu last updated: " + menu.getLastUpdated());
        menu.displayMenu();


    }
}
