public class Shooter extends Conditions{
    public Shooter(Mario mario) {
        super(mario);
    }
    @Override
    public void changingTheState() {
        System.out.println("Condition is Shooter.");
    }

    @Override
    public void powerDown() {
        System.out.println("Power Down! ");
        mario.setConditions(new BasePlus(mario));
    }

    @Override
    public void powerUp() {
        System.out.println("Power not Up! Power is max! ");
    }

    public void shoot(){
        System.out.println("Mario is shooting! ");
    }
}
