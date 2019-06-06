package task01;

public class Main {
    public static void main(String[] args) {
        //Числовой массив
        someEnty<Integer>[] arr1 = new someEnty[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new someEnty<Integer>(i);
        }
    }
}
