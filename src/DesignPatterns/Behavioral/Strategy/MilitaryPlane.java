package DesignPatterns.Behavioral.Strategy;

public class MilitaryPlane extends SpaceCraft{
    public MilitaryPlane(String name){
        super(name, new AttackWithGun());
    }
}
