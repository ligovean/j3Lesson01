package task03.Content;

public class Apple extends Fruits {

    public Apple(float fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public Apple() {
        this.fruitWeight = 1.0f;
    }

    public float getWeight() {
        return this.fruitWeight;
    }
}
