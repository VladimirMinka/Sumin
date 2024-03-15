package lesson137;

public class Rect {
    double lenght;
    double height;

    void setRect(double lenght, double height) {
        this.lenght = lenght;
        this.height = height;
    }

    double perimetrRect() {
        return 2 * (lenght + height);
    }

    double areaRect() {
        return lenght * height;
    }
}
