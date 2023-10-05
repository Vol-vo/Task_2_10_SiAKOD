public class Base extends Conditions {
    @Override
    public void changingTheState() {
        System.out.println("Condition is Base.");
    }

    @Override
    public Conditions powerUp() {
        System.out.println("Power up! ");
        return new BasePlus();
    }

    public Conditions powerDown() {
        System.out.println("Power not down! Power is minimum. ");
        return new Base();
    }
}
