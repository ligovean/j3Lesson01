package task02;

public class Main {
    public static void main(String args[]) {

        //Integer
        System.out.println("=====Integer====");

        SomeEntyArr<Integer> arrInt = new SomeEntyArr<Integer>(1,2,3,4,5,6,7);

        //Вывод на экран массива
        for (int i = 0; i <7 ; i++) {
            System.out.print(arrInt.getEntybyIndex(i) + " ");
        }
        System.out.println();

        //Вывод ArrayList, преобразованного из Массива
        System.out.println(arrInt.getArrayList());
        System.out.println();


        //String
        System.out.println("=====String====");

        SomeEntyArr<String> arrSt = new SomeEntyArr<String>("A","b","c","D","e","F","g");

        //Вывод на экран массива
        for (int i = 0; i <7 ; i++) {
            System.out.print(arrSt.getEntybyIndex(i) + " ");
        }
        System.out.println();

        //Вывод ArrayList, преобразованного из Массива
        System.out.println(arrSt.getArrayList());
        System.out.println();
    }
}



