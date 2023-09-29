public class Mario {
    Conditions conditions;

    public Mario(){
        conditions = new Base();
    }

    public void changeConditions() {
        conditions.changingTheState();
    }

    public void jump() {
        System.out.println("Mario jump!");
    }

    public void shoot() {
        if (conditions instanceof Shooter) {
           System.out.println("Mario shoot!");
        }else{
            System.out.println("Mario is not shoot!");
        }
    }

    public void powerUp(){
        if (conditions instanceof Base){
            conditions = new BasePlus();
            System.out.println("Now Mario very big");
        }
        else if (conditions instanceof BasePlus){
            conditions = new Shooter();
            System.out.println("Now Mario is Shooter");
        }else {
            System.out.println("Now Mario max level!");
        }
    }

    public void powerDown(){
        if (conditions instanceof Shooter){
            conditions = new BasePlus();
            System.out.println("Now Mario not Shooter!");
        }
        else if (conditions instanceof BasePlus){
            conditions = new Base();
            System.out.println("Now Mario is Base");
        }else {
            System.out.println("Now Mario low level!");
        }
    }
}
