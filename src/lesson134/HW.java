package lesson134;

public class HW {
    public static void main(String[] args) {
        String numberOfmonth = "апрель";

        switch (numberOfmonth) {
            case "январь": {
                System.out.println("зима");
                break;
            }
            case "февраль": {
                System.out.println("зима");
                break;
            }
            case "март": {
                System.out.println("весна");
                break;
            }
            case "апрель": {
                System.out.println("весна");
                break;
            }
            case "май": {
                System.out.println("весна");
                break;
            }
            case "июнь": {
                System.out.println("лето");
                break;
            }
            case "июль": {
                System.out.println("лето");
                break;
            }
            case "август": {
                System.out.println("лето");
                break;
            }
            case "сентябрь": {
                System.out.println("осень");
                break;
            }
            case "октябрь": {
                System.out.println("осень");
                break;
            }
            case "ноябрь": {
                System.out.println("осень");
                break;
            }
            case "декабрь": {
                System.out.println("зима");
                break;
            }
            default: {
                System.out.println("другой месяц");
            }
        }
    }
}
