public class Mario {
    Conditions conditions;

    public Mario(){
        this.conditions = new Base(this);
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public void changeConditions() {
        this.conditions.changingTheState();
    }

    public void jump() {
        this.conditions.jump();
    }

    public void shoot() {
        this.conditions.shoot();
    }

    public void powerUp(){
        conditions.powerUp();
    }

    public void powerDown(){
        conditions.powerDown();
    }




}
