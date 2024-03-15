package lesson132;

public class HW {
    public static void main(String[] args) {
        //все нечетные числа от 100 до 1000 с делением на 5
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

