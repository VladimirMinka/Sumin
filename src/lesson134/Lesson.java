package lesson134;

public class Lesson {
    public static void main(String[] args) {
        String[] month = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        String result = "";
        for (int i = 0; i < month.length; i++) {
            result += month[i];
            if (i == month.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.print(result);
        System.out.println();
        int numberOfmonth = 13;
        switch (numberOfmonth) {
            case 1: {
                System.out.println("январь");
                break;
            }
            case 2: {
                System.out.println("февраль");
                break;
            }
            case 3: {
                System.out.println("март");
                break;
            }
            case 4: {
                System.out.println("апрель");
                break;
            }
            case 5: {
                System.out.println("май");
                break;
            }
            case 6: {
                System.out.println("июнь");
                break;
            }
            case 7: {
                System.out.println("июль");
                break;
            }
            case 8: {
                System.out.println("август");
                break;
            }
            case 9: {
                System.out.println("сентябрь");
                break;
            }
            case 10: {
                System.out.println("октябрь");
                break;
            }
            case 11: {
                System.out.println("ноябрь");
                break;
            }
            case 12: {
                System.out.println("декабрь");
                break;
            }
            default: {
                System.out.println("другое число");
            }
        }
    }
}
