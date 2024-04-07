package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private LocalDate lastUpdated;  //localdate is a java class used to represent a instant time.

    //constructor
    public Menu(){
        this.menuItems=new ArrayList<>();
        this.lastUpdated=LocalDate.now();// Initialize lastUpdated with the current date
    }

    //Method to add a menu item
    public void addMenuItem(MenuItem item){
        item.setNew(true);
        menuItems.add(item);
        this.lastUpdated=LocalDate.now(); // Update lastUpdated when adding a new item
    }

    //Method to remove a menu item
    public void removeMenuItem(MenuItem item){
        item.setNew(true);
        menuItems.remove(item);
        this.lastUpdated=LocalDate.now();// Update lastUpdated when adding a new item
    }

    //Method to display menu

    public void displayMenu(){
        for(MenuItem item:menuItems){
            System.out.println("Name: " + item.getName());
            System.out.println("Price: " + item.getPrice());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Is New: " + item.isNew());

        }
    }
    // Getter for lastUpdated
    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

}
