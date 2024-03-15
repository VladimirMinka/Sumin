package lesson141;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("имя: " + name);
        System.out.println("возраст: " + age);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else
            System.out.println("возраст должен быть больше 0");
    }
}
