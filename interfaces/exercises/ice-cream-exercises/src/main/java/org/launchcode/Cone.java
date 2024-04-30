package org.launchcode;

import java.util.ArrayList;

public class Cone extends Ingredient {
    public Cone(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost);
    }

    @Override
    public ArrayList<String> getAllergens() {
        return super.getAllergens();
    }

    @Override
    public void setAllergens(ArrayList<String> allergens) {
        super.setAllergens(allergens);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
