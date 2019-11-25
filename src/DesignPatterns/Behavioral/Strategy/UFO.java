package DesignPatterns.Behavioral.Strategy;

public class UFO extends SpaceCraft{
    public UFO(String name){
        super(name, new AttackWithLaser());
    }
}
