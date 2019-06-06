package task01;

public class Main {
    public static void main(String args[]) {
        System.out.println("=====Integer====");
        //Integer
        SomeEntyArr<Integer> arrInt = new SomeEntyArr<Integer>(1,2,3,4,5,6,7);
        for (int i = 0; i <7 ; i++) {
            System.out.print(arrInt.getEntybyIndex(i) + " ");
        }
        System.out.println();
        arrInt.replEnty(1,5); //Перемена 1-го и 5-го местами

        for (int i = 0; i <7 ; i++) {
            System.out.print(arrInt.getEntybyIndex(i) + " ");
        }
        System.out.println();
        System.out.println("=====String====");
        //String
        SomeEntyArr<String> arrSt = new SomeEntyArr<String>("A","b","c","D","e","F","g");
        for (int i = 0; i <7 ; i++) {
            System.out.print(arrSt.getEntybyIndex(i) + " ");
        }
        System.out.println();
        arrSt.replEnty(3,6);//Перемена 3-го и 6-го местами

        for (int i = 0; i <7 ; i++) {
            System.out.print(arrSt.getEntybyIndex(i) + " ");
        }

    }

}



