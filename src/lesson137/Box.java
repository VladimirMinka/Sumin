package lesson137;

public class Box {
    double weight;
    double height;
    double lenght;

    void setDimense(double weight, double height, double lenght) {
        this.weight = weight;
        this.height = height;
        this.lenght = lenght;
    }

    double volume() {
        return weight * height * lenght;
    }
}
