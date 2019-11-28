package DesignPatterns.Creational.AbstractFactory;

public class Clown {
    public Baloon getBaloon(String order){
        Baloon baloon;
        if(order.equals("dog")){
            return new DogBaloon();
        } else {
            return new SwordBaloon();
        }
    }
}
