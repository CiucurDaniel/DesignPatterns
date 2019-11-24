package DesignPatterns.Creational.Singleton;

public class MySingleton {
    public String databaseID;
    private static MySingleton myInstance =null;

    //private constructor
    private MySingleton(){
        databaseID="localhost:33671;CiucurDaniel-@storedatabase";
    }

    public static MySingleton getInstance(){
        if(myInstance == null){
            myInstance = new MySingleton();
        }
        return myInstance;
    }
}
