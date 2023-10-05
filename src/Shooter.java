public class Shooter extends Conditions{
    @Override
    public void changingTheState() {
        System.out.println("Condition is Shooter.");
    }

    @Override
    public Conditions powerDown() {
        System.out.println("Power Down! ");
        return new BasePlus();
    }

    @Override
    public Conditions powerUp() {
        System.out.println("Power not Up! Power is max! ");
        return new Shooter();
    }

    public void shoot(){
        System.out.println("Mario is shooting! ");
    }
}
