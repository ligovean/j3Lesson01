package task03;

import task03.Content.Apple;
import task03.Content.Orange;

public class Main {
    public static void main(String[] args) {

        //Коробка апельсинов
        Box<Orange> boxOfOrange1 = new Box<Orange>();

        //Наполнение коробок апельсинами
        boxOfOrange1.putFruit(new Orange(2.1f)); //Положим в коробку один большой апельсин
        for (int i = 0; i <9 ; i++) {//И ещё 9 обычных
            boxOfOrange1.putFruit(new Orange());
        }

        //Коробка ябок
        Box<Apple> boxOfApple1 = new Box<Apple>();

        //Наполнение коробок яблоками
        boxOfApple1.putFruit(new Apple(0.5f));  //Положим в коробку одно мальенькое яблоко
        for (int i = 0; i <10 ; i++) { //И ещё 10 обычных
            boxOfApple1.putFruit(new Apple());
        }
        boxOfApple1.putFruit(new Apple(5.1f));  //Положим в коробку одно огромное яблоко чтобы уровнять вес коробок

        System.out.printf("Вес коробки с апельсинами: %.2f \n", boxOfOrange1.getWeight());
        System.out.printf("Вес коробки с яблоками: %.2f \n", boxOfApple1.getWeight());

        System.out.println("Вес коробок равен? " + boxOfApple1.compare(boxOfOrange1));

    }
}
