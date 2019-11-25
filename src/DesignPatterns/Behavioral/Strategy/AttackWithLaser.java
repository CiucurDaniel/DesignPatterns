package DesignPatterns.Behavioral.Strategy;

public class AttackWithLaser implements attackStrategy{
    @Override
    public void attack() {
        System.out.println("I shoot lasers!!! Pew Pew Pew");
    }
}
