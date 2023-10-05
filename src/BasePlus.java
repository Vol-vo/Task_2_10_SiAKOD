public class BasePlus extends Conditions{
    public BasePlus(Mario mario) {
        super(mario);
    }

    @Override
    public void changingTheState() {
        System.out.println("Condition is Base Plus.");
    }

    @Override
    public void powerUp() {
        System.out.println("Power up! ");
        mario.setConditions(new Shooter(mario));
    }

    @Override
    public void powerDown() {
        System.out.println("Power Down! ");
        mario.setConditions(new Base(mario));
    }
}
