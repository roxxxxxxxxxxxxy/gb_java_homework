package homework6;

public class Dog extends Animal {
    public static final int LIMIT_RUN = 500;
    public static final int LIMIT_SWIM = 10;

    public Dog(int runDistance, int swimDistance) {
        super(runDistance, swimDistance);
    }

    public Dog() {
        this(LIMIT_RUN, LIMIT_SWIM);
    }

    @Override
    public boolean run(int distance) {
        if (this.runDistance >= distance) {
            System.out.println("Собака пробежала " + distance + " метров");
            return true;
        }
        System.out.println("Собака может пробежать только " + LIMIT_RUN + " метров");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (this.swimDistance >= distance) {
            System.out.println("Собака проплыла " + distance + " метров");
            return true;
        }
        System.out.println("Собака может проплыть только " + LIMIT_SWIM + " метров");
        return false;
    }
}
