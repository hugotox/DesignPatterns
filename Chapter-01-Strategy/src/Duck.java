import behaviors.FlyBehavior;
import behaviors.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performFLy() {
        this.getFlyBehavior().fly();
    }

    public void performQuack() {
        this.getQuackBehavior().quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }


    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
