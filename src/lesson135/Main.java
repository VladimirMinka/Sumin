package lesson135;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.age = 33;
        human.name = "Oleg";
        human.weight = 75;
        Human human2 = new Human();
        human2.age = 15;
        human2.name = "Olga";
        human2.weight = 34;
        Human human3 = new Human();
        human3.age = 20;
        human3.name = "Sveta";
        human3.weight = 48;
        Human human4 = new Human();
        human4.age = 63;
        human4.name = "Sergey";
        human4.weight = 93;
        Human human5 = new Human();
        human5.age = 36;
        human5.name = "Larisa";
        human5.weight = 65;
        double result = (human.weight + human2.weight + human3.weight + human4.weight + human5.weight) / 5;
        System.out.println(result);
        System.out.println();
        Box box5 = new Box();
        box5.lenght = 5;
        box5.width = 5;
        box5.height = 5;
        Box box6 = new Box();
        box6.lenght = 10;
        box6.width = 10;
        box6.height = 10;
        double volume = box5.Volume();
        System.out.println(volume);
        double volume2 = box6.Volume();
        System.out.println(volume2);
    }
}
