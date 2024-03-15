package lesson146;

public class CatsFamily {
    private int legs;
    private int ears;
    private boolean bigClaws;

    public CatsFamily() {
        legs = 4;
        ears = 2;
        bigClaws = true;
    }

    public CatsFamily(int legs, int ears, boolean bigClaws) {
        this.legs = legs;
        this.ears = ears;
        this.bigClaws = bigClaws;
    }

    public void showInfo() {
        System.out.println("количество ушей-" + ears + " количество лап-" + legs + " наличие больших когтей-" + bigClaws);

    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }
    public  void eat(){
        System.out.println("кушаю");
    }
}
