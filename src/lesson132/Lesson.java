package lesson132;

public class Lesson {
    public static void main(String[] args) {
        //циклы
        int i = 1;
        while (i <= 10) {
            System.out.println("i: " + i);
            i++;
            if (i == 6)
                break;
        }
        //выводим четные числа от 1000 до 0
        int b = 1000;
        while (b >= 0) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
            b--;
        }
        System.out.println();
        //среднее арифметическое от 0 до 100
        int sum = 0;
        int count = 1;
        while (count <= 100) {
            sum += count;
            count++;
        }
        float result = sum / (float) count;
        System.out.println(result);
        System.out.println();
        int c = 0;
        do {
            System.out.println("привет");
        } while (c > 0);
        System.out.println();
        for (int d = 1000; d >= 0; d--) {
            if (d % 3 == 0) {
                System.out.println(d);
            }
        }
    }
}
