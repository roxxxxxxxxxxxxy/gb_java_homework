package homework7;

import java.util.Scanner;

public class TestCat {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Том", 10);
        Cat cat2 = new Cat("Tim", 10);
        Cat cat3 = new Cat("TamTam", 10);

        Cat[] cats = {cat1, cat2, cat3};

        Plate plate = new Plate(0);

        info(cats, plate);
        addFood(plate);
        toEat(cats, plate);
    }

    private static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Добавьте корм: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);
    }

    private static void info(Cat[] cats, Plate plate) {
        plate.info();
    }

    private static void toEat(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Котик '%s (volume: %d)' наелся? Ответ: %s%n",
                    cat.getName(),
                    cat.getFood(),
                    cat.catSatiety(),
                    result);
        }
    }
}
