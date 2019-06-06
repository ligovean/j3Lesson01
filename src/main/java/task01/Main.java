package task01;

public class Main {
    public static void main(String args[]) {

        //Integer
        System.out.println("=====Integer====");

        SomeEntyArr<Integer> arrInt = new SomeEntyArr<Integer>(1,2,3,4,5,6,7);

        //Вывод на экран до перемены элементов
        for (int i = 0; i <7 ; i++) {
            System.out.print(arrInt.getEntybyIndex(i) + " ");
        }
        System.out.println();

        arrInt.replEnty(1,5); //Перемена 1-го и 5-го местами

        //Вывод на экран после перемены элементов
        for (int i = 0; i <7 ; i++) {
            System.out.print(arrInt.getEntybyIndex(i) + " ");
        }
        System.out.println();


        //String
        System.out.println("=====String====");

        SomeEntyArr<String> arrSt = new SomeEntyArr<String>("A","b","c","D","e","F","g");

        //Вывод на экран до перемены элементов
        for (int i = 0; i <7 ; i++) {
            System.out.print(arrSt.getEntybyIndex(i) + " ");
        }
        System.out.println();
        arrSt.replEnty(3,6);//Перемена 3-го и 6-го местами

        //Вывод на экран после перемены элементов
        for (int i = 0; i <7 ; i++) {
            System.out.print(arrSt.getEntybyIndex(i) + " ");
        }
    }
}



