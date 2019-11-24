package DesignPatterns.Structural.Decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to my CoffeShop !");
        System.out.println(      "Dani Coffee Shop"       );
        System.out.println( " |****  PRICE TABLE  ****|"            );
        System.out.println("| Espresso           5 LEI|");
        System.out.println("| Dark Roast         7 LEI|");
        System.out.println("| Cappuccino        10 LEI|");
        System.out.println("|                         |");
        System.out.println("| Milk               1 LEI|");
        System.out.println("| Cinnamon           2 LEI|");
        System.out.println("| Soy                1 LEI|");
        System.out.println("---------------------------");

        System.out.println();

        System.out.println("What can I serve you with?\n");

        System.out.println(" - I would like an Espresso with cinnamon and milk\n");

        Espresso espresso = new Espresso(); //cost is 5
        Cinnamon cinnamon = new Cinnamon(espresso); // cost is 5+2=7
        Milk milk = new Milk(cinnamon); //cost 7+1=8

        System.out.println("There is your order sir");
        System.out.println(milk.getDescription());
        System.out.println();

        System.out.println("You need to pay " + milk.getCost() + " LEI .");



    }
}
