package DesignPatterns.Behavioral.Strategy;

public abstract class SpaceCraft {
    String name;
    attackStrategy attack_strategy;

    public SpaceCraft(String name, attackStrategy as){
        this.name = name;
        this.attack_strategy = as;
    }

    public void setAttack_strategy(attackStrategy attack_strategy) {
        this.attack_strategy = attack_strategy;
    }

    public void performAttack(){
        attack_strategy.attack();
    }

    //display method
    public void displaySpaceShip(){
        System.out.print("SpaceCraft: : " + name + " attack method: ");
        attack_strategy.attack();
    }
}//end-class
