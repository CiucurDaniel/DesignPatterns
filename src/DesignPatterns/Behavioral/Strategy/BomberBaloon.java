package DesignPatterns.Behavioral.Strategy;

public class BomberBaloon extends SpaceCraft{
    public BomberBaloon(String name){
        super(name, new AttackWithBombs());
    }
}
