import behaviors.FlyWithWings;
import behaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    public void display() {
        System.out.println("Hello, I'm a Mallard Duck!");
    }
}
