package lesson138;

import java.security.PublicKey;

public class Box {
    double weight;
    double height;
    double lenght;

    void setDimense(double weight, double height, double lenght) {
        this.weight = weight;
        this.height = height;
        this.lenght = lenght;
    }

    public Box(double weight, double height, double lenght) {
        this.weight = weight;
        this.height = height;
        this.lenght = lenght;
    }

    public Box(int size) {
        weight = size;
        height = size;
        lenght = size;
    }

    public Box(Box box) {
        this.weight = box.weight;
        this.height = box.height;
        this.lenght = box.lenght;
    }

    double volume() {
        return weight * height * lenght;
    }

    public void showVolume() {
        double volume = weight * height * lenght;
        System.out.println(volume);
    }

    public int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public Box increase() {
        return new Box(weight * 2, height * 2, lenght * 2);

    }
}
