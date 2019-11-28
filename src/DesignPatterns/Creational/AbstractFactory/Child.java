package DesignPatterns.Creational.AbstractFactory;

public class Child {
    public static void main(String[] args) {
        System.out.println("Sam:      Hi Mrs. Clown, me want a ballon!");

        System.out.println("Clown:     Hiii what should your balloon be kid?");
        System.out.println("Sam:     I want a dog ballon!");

        System.out.println("Clown:     There you go kiddie.");

        //create a factory
        Clown clown = new Clown();
        //factory instantiates an object "new"
        Baloon baloon = clown.getBaloon("dog");
        System.out.println(baloon.getType());
    }
}
