package lesson148.HW;


public class Programmer extends Employee implements Programable {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void programable() {
        System.out.println("программирую");
    }
}
