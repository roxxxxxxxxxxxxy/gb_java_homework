package homework6;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int distance = random.nextInt(500);

        Cat cat = new Cat();
        cat.run(distance);
        cat.swim(distance);

        Dog dog = new Dog();
        dog.run(distance);
        dog.swim(distance);
    }
}
