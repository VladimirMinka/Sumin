package lesson146;

public class Cat extends CatsFamily {
    public Cat() {
        super(2, 4, false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("вискас");
    }
}
