package lesson136;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Полкан";
        dog.breed = "Овчарка";
        dog.speed = 12;
        System.out.println(dog.info());
        for (int i = 0; i < dog.speed; i++) {
            dog.run();
        }
    }
}
