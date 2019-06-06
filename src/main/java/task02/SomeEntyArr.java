package task02;

import java.util.ArrayList;

public class SomeEntyArr<T>  {
    private T[] arr;

    public SomeEntyArr(T... arr) {
        this.arr = arr;
    }

    //Метод преобразования Массива в ArrayList
    public ArrayList<T> getArrayList(){
        ArrayList<T> result = new ArrayList<T>();
        for (T obj:arr)
        {
            result.add(obj);
        }


        return result;
    }

    //Метод получения элемента массива
    public T getEntybyIndex(int ind){
        return this.arr[ind];
    }
}