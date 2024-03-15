package lesson149.HW;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Counter() {
            @Override
            public String report(int month) {
                return "отчет за " + month + " месяцев";
            }
        }, 8);
        Count count = new Count();
        director.force(count, 9);
    }
}
