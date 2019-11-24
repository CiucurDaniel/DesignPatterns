package DesignPatterns.Structural.Decorator;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage){
        super(1, "soy", beverage);
    }
}
