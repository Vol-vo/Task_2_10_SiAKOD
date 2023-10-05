public class Mario {
    Conditions conditions;

    public Mario(){
        this.conditions = new Base();
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
        this.conditions = this.conditions.powerUp();
    }

    public void powerDown(){
        this.conditions = this.conditions.powerDown();
    }




}
