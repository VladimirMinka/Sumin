package lesson133;

public class HW {
    public static void main(String[] args) {
        /* создать массив и проициализировать его значениями от 100 до 1000
        создать второй массив по длине равный первому, пронициализировать его значениями взятыми из первого массива, но в обратном порядке.
        В цикле for each вывести все элементы второго массива
        */
        int[] first = new int[900];
        for (int i = 0; i < first.length; i++) {
            first[i] = i + 100;

        }
        int[] second = new int[first.length];
        for (int i = 0, j = first.length - 1; i < second.length; i++, j--) {
            second[j] = first[i];
        }
        for (int i1 : second) {
            System.out.println(i1);
        }
    }
}