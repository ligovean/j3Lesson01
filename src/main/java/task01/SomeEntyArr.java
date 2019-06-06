package task01;

public class SomeEntyArr<T> {
    private T[] arr;

    public SomeEntyArr(T... arr) {
        this.arr = arr;
    }

    public void replEnty(int oldEntyInd,int newEntyInd ){
        T tmparr;
        tmparr = arr[oldEntyInd];
        arr[oldEntyInd] = arr[newEntyInd];
        arr[newEntyInd] = tmparr;
    }

    public T getEntybyIndex(int ind){
        return this.arr[ind];
    }
}