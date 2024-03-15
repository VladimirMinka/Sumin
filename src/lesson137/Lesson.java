package lesson137;

public class Lesson {
    public static void main(String[] args) {
        Box box = new Box();
        box.setDimense(15, 15, 15);
        System.out.println(box.volume());
        /* Создать класс Rect в котром будет два поля длина и ширина.
        Объявить три метода
         1) принимает ширину и длину и устанавливает их у прямоугольника
         2) метод без параметров-возвращает периметр прямоугольника
         3) метод без параметров-возвращает площадь прямоугольника
         */
        Rect rect = new Rect();
        rect.setRect(20, 30);
        System.out.println(rect.areaRect());
        System.out.println(rect.perimetrRect());
    }
}
