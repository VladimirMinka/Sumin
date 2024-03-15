package lesson140;

import lesson138.Box;

public class Lesson {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(box);

        Box box3 = box.increase();

        int result = box.compare(box2);
        switch (result) {
            case -1:
                System.out.println("коробка меньше");
                break;
            case 0:
                System.out.println("коробки равны");
                break;
            case 1:
                System.out.println("коробка больше");
                break;
        }
    }
}
