public class BasePlus extends Conditions{
    @Override
    public void changingTheState() {
        System.out.println("Condition is Base Plus.");
    }

    @Override
    public Conditions powerUp() {
        System.out.println("Power up! ");
        return new Shooter();
    }

    @Override
    public Conditions powerDown() {
        System.out.println("Power Down! ");
        return new Base();
    }
}
