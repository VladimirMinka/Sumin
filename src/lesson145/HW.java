package lesson145;

import java.util.ArrayList;

public class HW {
    public static void main(String[] args) {
        /* ДЗ создаем 3 коллекции
        1-я содержит числа от 1 до 10
        2-я содержит имена студентов их должно быть столько же сколько чисел в первой коллекции
        3-я третья хранит строки в которых будет значения: Номер-Имя значения сипользовать в цикле используя 1 и 2 коллекцию.
        Вывести значение 3-й коллекции через цикл for each
        */

        //создаем коллекцию
        ArrayList<Integer> number = new ArrayList<>();
        //заполняем коллекцию от 1 до 10
        for (int i = 1; i <= 10; i++) {
            number.add(i);
        }

        ArrayList<String> studentName = new ArrayList<>();

        studentName.add("Илья");
        studentName.add("Ольга");
        studentName.add("Наташа");
        studentName.add("Варя");
        studentName.add("Лия");
        studentName.add("Владимир");
        studentName.add("Олег");
        studentName.add("Валерий");
        studentName.add("Сергей");
        studentName.add("Семен");

        ArrayList<String> str = new ArrayList<>();

        for (int i = 0; i < number.size(); i++) {
            String s = number.get(i) + "-" + studentName.get(i);
            str.add(s);
        }
        for (String words : str
        )
            System.out.println(words);
        {

        }
    }
}
