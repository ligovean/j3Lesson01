package task03;

import task03.Content.Fruits;
import java.util.ArrayList;

public class Box<T extends Fruits> {
    private ArrayList<T> someFrts = new ArrayList<T>();
    private float boxWght=0.0f;

    //Метод добавить 1 фркут
    public void putFruit(T oneFruit){
        someFrts.add(oneFruit);
        boxWght += oneFruit.getWeight();
    }

    //Метод получить вес коробки
    public float getWeight(){
        return this.boxWght;
    }

    //Метод сравнить эту коробку с предлагаемой
    public boolean compare(Box<?> otherBox){
        return this.getWeight() == otherBox.getWeight();
    }

    //Метод получить содержимое коробки
    public ArrayList<T> getBoxContent(){
        return someFrts;
    }

    //Метод пересыпания из Этой коробки в предлагаемую
    public void pour(Box<T> otherBox){
        for (T someFrt: this.getBoxContent())
        {
            otherBox.putFruit(someFrt);
        }
        this.someFrts.clear();
        boxWght=0.0f;
    }
}
