package lesson139;

import lesson138.Box;

public class Lesson {
    public static void main(String[] args) {
        Test test = new Test();
        int result = test.multiple(5);
        System.out.println(result);


        Box box = new Box(5);
        box.showVolume();

        Monstr monstr = new Monstr();
        monstr.voice(2);
        Monstr monstr1 = new Monstr();
        monstr1.voice(3, "ГАВ");

    }
}
