package lesson128;

public class HW {
    //вводим кол0во секунд, а программа выводит сколько это дней, часов, минут и секунд.
    public static void main(String[] args) {
        int second = 86400;
        int day = second / 60 / 60 / 24;
        int hours = day * 24;
        int minutes = hours * 60;
        int sec = minutes * 60;
        System.out.println("дней:" + day);
        System.out.println("часов:" + hours);
        System.out.println("минут:" + minutes);
        System.out.println("секунд:" + sec);
    }
}
