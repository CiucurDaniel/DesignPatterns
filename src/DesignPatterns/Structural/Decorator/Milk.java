package DesignPatterns.Structural.Decorator;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage){
        super(1,"milk", beverage);
    }
}
