package lesson144;

import java.awt.geom.Arc2D;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String st = "Это Иван. ему 34 года, его рост 166.3 см. Должность- программист";
        String name = st.substring(4, 9);
        String ag = st.substring(14, 16);
        int age = Integer.parseInt(ag);
        String heigh = st.substring(31, 38);
        double height = Double.parseDouble(heigh);
        String position = st.substring(42, 64);
        Man man = new Man(name, position, age, height);
        System.out.println(man.getName() + man.getPosition() + " его возраст  " + man.getAge() + " его рост составляет "+ man.getHeight());
    }
}
