package DesignPatterns.Behavioral.Strategy;

public class AttackWithGun implements attackStrategy{
    @Override
    public void attack() {
        System.out.println("I shoot with a gun! Boom boom boom");
    }
}
