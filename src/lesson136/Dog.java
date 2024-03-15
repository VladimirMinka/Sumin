package lesson136;

import javax.sound.midi.Soundbank;

public class Dog {
    /*создать класс dog. у негго три поля-кличка, порода, скорость
    создать 2 метода-run без параметров.При вызове метода выводится строка "бегу бегу бегу"
 столько раз сколько указана скорость
      второй метод string info возвращает строку с полной информацией о собаке(кличка, порода, скорость) и этот метод ничего не выводит.
      Продемонстрировать работу методов в Main
      */

    String name;
    String breed;
    int speed;

    void run() {
        System.out.print("Бегу ");
    }

    String info() {
        return name + " " + breed + " " + speed;
    }
}
