public abstract class Conditions {

    protected Mario mario;
    public Conditions(Mario mario) {
        this.mario = mario;
    }

    public void changingTheState() {}

    public abstract void powerUp();

    public abstract void powerDown();

    public void shoot(){}

    public void jump(){
        System.out.println("Mario is jumping! ");
    }

}
