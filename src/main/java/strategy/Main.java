package strategy;

public class Main {
    public static void main(String[] args) {
        FlyBehavior fly1 = new FlyWithWings();
        fly1.fly();

        FlyBehavior fly2 = new FlyNoWay();
        fly2.fly();

        FlyBehavior fly3 = new FlyRocketPowered();
        fly3.fly();
    }
}
