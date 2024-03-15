package lesson149.HW;

public class Count implements Counter {
    @Override
    public String report(int month) {
        return "отчет за " + month + "месяцев";

    }
}
