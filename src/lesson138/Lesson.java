package lesson138;


public class Lesson {
    public static void main(String[] args) {
        Box box = new Box(10, 15, 20);
        System.out.println(box.volume());
        Box box2 = new Box(20, 20, 20);
        System.out.println(box2.volume());

        Worker worker = new Worker("сергей", "водитель", 5000);
        System.out.println(worker.dateWorker(5));
    }

}
