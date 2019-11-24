package DesignPatterns.Structural.Decorator;

public abstract class Beverage {
    private int cost;
    private String description;

    public Beverage(int cost, String description){
        this.cost = cost;
        this.description = description;
    }
    public int getCost(){
        return this.cost;
    }

    public String getDescription() {
        return description;
    }
}//end-class
