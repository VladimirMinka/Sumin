package lesson146HW;

public class Box {
    private int height;
    private int lenght;

    public Box(int height, int lenght) {
        this.height = height;
        this.lenght = lenght;
    }

    public Box() {
        height = 0;
        lenght = 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void showInfo() {
        System.out.println("Коробка имеет параметры длины и ширины:" + lenght + " " + height);
    }
}
