package DesignPatterns.Structural.Decorator;

public abstract class CondimentDecorator extends Beverage{
    private Beverage beverage;
    public CondimentDecorator(int cost, String description, Beverage beverage){
        super(cost, description);
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + super.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + super.getDescription();
    }
}
