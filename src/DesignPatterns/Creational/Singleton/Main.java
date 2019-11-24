package DesignPatterns.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        MySingleton databaseConnector = MySingleton.getInstance();
        System.out.println(databaseConnector.databaseID);

        /*MySingleton willPrintError = new MySingleton();
        will not work because the constrcutor is private
         */

        databaseConnector.databaseID = "fvhebkjr";
        System.out.println(databaseConnector.databaseID);
    }
}
