package lesson148.HW;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Илья");
        Programmer programmer2 = new Programmer("Сергей");
        Programmer programmer3 = new Programmer("Джон");
        Cooker cooker = new Cooker("Ольга");
        Cooker cooker2 = new Cooker("Вероника");
        Cooker cooker3 = new Cooker("Вера");
        Driver driver = new Driver("Петр");
        Driver driver2 = new Driver("Василий");
        Driver driver3 = new Driver("Юрий");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(cooker);
        employees.add(cooker2);
        employees.add(cooker3);
        employees.add(programmer);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(driver);
        employees.add(driver2);
        employees.add(driver3);

        for (Employee name : employees) {
            name.voice();
        }

        ArrayList<Programmer> programmers = new ArrayList<>();
        programmers.add(programmer);
        programmers.add(programmer2);
        programmers.add(programmer3);
        for (Programmer prog : programmers) {
            prog.programable();
        }

        ArrayList<Cooker> cookers = new ArrayList<>();
        cookers.add(cooker);
        cookers.add(cooker2);
        cookers.add(cooker3);
        for (Cooker cook : cookers) {
            cook.cook();
        }

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(driver);
        drivers.add(driver2);
        drivers.add(driver3);
        for (Driver dr : drivers) {
            dr.drive();
        }
    }
}
