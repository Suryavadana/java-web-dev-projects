package org.launchcode;


import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu() {
        this.lastUpdated = LocalDate.now();
        this.items = new ArrayList<>(); // Initialize items as an empty ArrayList
    }

    public void setLastUpdated() {
        this.lastUpdated = LocalDate.now();
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    // Method to add a menu item
    public void addMenuItem(MenuItem item) {
        item.setNew(true);
        items.add(item);
        setLastUpdated(); // Update lastUpdated when adding a new item
    }

    // Method to remove a menu item
    public void removeMenuItem(MenuItem item) {
        items.remove(item);
        setLastUpdated(); // Update lastUpdated when removing an item
    }

    // Method to display menu
    public void displayMenu() {
        for (MenuItem item : items) {
            System.out.println("Price: " + item.getPrice());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Is New: " + item.isNew());
            System.out.println(); // Add a line break for separation
        }
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }
}