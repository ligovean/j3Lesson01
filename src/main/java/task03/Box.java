package task03;

import task03.Content.Fruits;
import java.util.ArrayList;

public class Box<T extends Fruits> {
    private ArrayList<T> someFrts = new ArrayList<T>();

    public void putFruit(T oneFruit){

        someFrts.add(oneFruit);
    }

    public float getWeight(){
        float boxWght=0.0f;
        for (T someFr: someFrts) {
            boxWght += someFr.getWeight();
        }
        return boxWght; 
    }

    public boolean compare(Box<?> otherBox){
        return this.getWeight() == otherBox.getWeight();
    }

    public ArrayList<T> getBoxContent(){
        return someFrts;
    }
}
