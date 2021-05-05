package homework6;

public class Cat extends Animal {
    public static final int LIMIT_RUN = 200;
    public static final int LIMIT_SWIM = 0;

    public Cat(int runDistance, int swimDistance) {
        super(runDistance, swimDistance);
    }

    public Cat() {
        this(LIMIT_RUN, LIMIT_SWIM);
    }

    @Override
    public boolean run(int distance) {
        if (this.runDistance >= distance) {
            System.out.println("Кошка пробежала " + distance + " метров");
            return true;
        }
        System.out.println("Кошка может пробежать только " + LIMIT_RUN + " метров");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Кошка не умеет плавать");
        return false;
    }
}
