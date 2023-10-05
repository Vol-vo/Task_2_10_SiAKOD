public class Base extends Conditions {

    public Base(Mario mario) {
        super(mario);
    }

    @Override
    public void changingTheState() {
        System.out.println("Condition is Base.");
    }

    @Override
    public void powerUp() {
        System.out.println("Power up! ");
        mario.setConditions(new BasePlus(mario));
    }

    public void powerDown() {
        System.out.println("Power not down! Power is minimum. ");
    }
}
