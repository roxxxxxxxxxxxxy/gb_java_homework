package homework6;

public abstract class Animal {
    protected int runDistance;
    protected int swimDistance;


    public Animal(int runDistance, int swimDistance) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public abstract boolean run(int distance);

    public abstract boolean swim(int distance);
}
