package task03.Content;

public class Orange extends Fruits {
    public Orange(float fruitWeight) {
        this.fruitWeight = fruitWeight;
    }
    public Orange() {
        this.fruitWeight = 1.5f;
    }

    public float getWeight() {
        return this.fruitWeight;
    }
}
