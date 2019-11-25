package DesignPatterns.Behavioral.Strategy;

public class AttackWithBombs implements attackStrategy{
    @Override
    public void attack() {
        System.out.println("I attack with bombs! boom explosion and another one");
    }
}
