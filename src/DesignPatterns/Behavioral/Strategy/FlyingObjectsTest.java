package DesignPatterns.Behavioral.Strategy;

public class FlyingObjectsTest {
    public static void main(String[] args) {
        MilitaryPlane mz1042 = new MilitaryPlane("MZ1042");

        mz1042.displaySpaceShip();
        System.out.println();
        System.out.println("Military plane mz1042 attacks:");
        mz1042.performAttack();
        System.out.println();

        UFO alienShip = new UFO("Alien UFO");
        System.out.println("Alien Ship will attack");
        alienShip.performAttack();

        alienShip.setAttack_strategy(new AttackWithGun());
        System.out.println("Alien Ship will attack again");
        alienShip.performAttack();

    }
}
