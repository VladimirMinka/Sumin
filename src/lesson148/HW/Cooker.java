package lesson148.HW;

public class Cooker extends Employee implements Cookeable {
    public Cooker(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("готовлю еду");
    }
}
