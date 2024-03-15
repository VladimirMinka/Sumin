package lesson146HW;

public class BoxWeight extends Box {
    private int weights;

    public BoxWeight(int height, int lenght, int weight, int weights) {
        super(height, lenght);
        this.weights = weights;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("вес" + weights);
    }

    public int getWeights() {
        return weights;
    }

    public void setWeight(int weights) {
        this.weights = weights;
    }
}
