package DesignPatterns.Structural.Decorator;

public class Cinnamon extends CondimentDecorator{
    public Cinnamon(Beverage beverage){
        super(2, "cinnamon", beverage);
    }
}
