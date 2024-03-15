package lesson139;

public class Monstr {
    /*создать класс Монстр с 3 мя полями типа int(кол-во глаз, ног и рук).
    Создать конструктор без параметров который установит всем значение 2
    Создать 3 контруктора
    1) принимает параметры кол-во глаз. Устанавливает кол-во глаз равным переданному аргументу, а кол-во рук и ног равным 2
    2) принимает параметры кол-во глаз и рук, тоже самое как в примере а ноги-2
    3)принимает параметры кол-во глаз,рукии ноги, все данные берутся из конструктора.



    void voice() выводи слово Голос
    void voice(int) выводи слово голос i раз
    void voice(int i, String word) выводи слово word i раз
    */

    int eyes;
    int hands;
    int legs;

    public Monstr() {
        this.eyes = 2;
        this.hands = 2;
        this.legs = 2;
    }


    public Monstr(int eyes) {
        this.eyes = eyes;
        this.hands = 2;
        this.legs = 2;
    }

    public Monstr(int eyes, int hands) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = 2;
    }

    public Monstr(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    void voice() {
        System.out.println("голос");
    }

    void voice(int i) {
        for (int a = 0; a < i; a++) {
            System.out.println("голос ");
        }
    }

    void voice(int i, String word) {
        for (int a = 0; a < i; a++) {
            System.out.println(word);
        }
    }
}