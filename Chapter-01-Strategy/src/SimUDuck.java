import behaviors.FlyRockerPowered;

public class SimUDuck {

    public static void main(String args[]) {
        System.out.println("- Mallard Duck:");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFLy();
        System.out.println();

        System.out.println(" - Model Duck:");
        Duck model = new ModelDuck();
        model.performFLy();
        model.performQuack();
        model.setFlyBehavior(new FlyRockerPowered());
        model.performFLy();
    }
    
}
