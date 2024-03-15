package lesson148.HW;

public class Driver extends Employee implements Driverable{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("веду машину");
    }
}
