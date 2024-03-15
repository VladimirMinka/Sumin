package lesson145;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Lesson {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Владимир");
        employees.add("Василий");
        employees.add("Илья");
        employees.add("Сергей");
        employees.add("Сергей");
        employees.add("Илья");
        for (String name : employees) {
            System.out.println(name);
        }
        System.out.println();
        //HashSet выводит только уникальные значения
        HashSet<String> name = new HashSet<>();
        name.add("владимир");
        name.add("илья");
        name.add("ольга");
        name.add("владимир");
        for (String n : name) {
            System.out.println(n);
        }
        System.out.println();
        //TreeSet выводит все в отсортированном ввиде
        TreeSet<Integer> num = new TreeSet<>();
        num.add(1);
        num.add(3);
        num.add(7);
        num.add(0);
        num.add(1);
        for (int a:num) {
            System.out.println(a);
        }

    }
}
