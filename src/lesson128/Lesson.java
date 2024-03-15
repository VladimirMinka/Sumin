package lesson128;

public class Lesson {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println("a + b = " + c);
        int days = 5000;
        int years = days / 365;
        int month = (days % 365) / 31;
        int leftdays = days - years * 365 - month * 31;
        System.out.println("общее количество дней:" + days);
        System.out.println("лет:" + years);
        System.out.println("месяцев:" + month);
        System.out.println("дней:" + leftdays);
    }
}