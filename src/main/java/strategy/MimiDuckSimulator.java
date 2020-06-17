package strategy;

import strategy.ModelDuck;

public class MimiDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        System.out.println("-----------------");
        mallard.performQuack();
        mallard.performFly();
        System.out.println("-----------------");
        Duck model = new ModelDuck();
        model.performFly();
        //??????????????? ????? ??? ??? flyBehavior
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
