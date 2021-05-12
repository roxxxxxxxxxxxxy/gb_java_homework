package homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("В тарелке: " + food);
    }

    public void reduceFood(int volume) {
        this.food -= volume;
    }

    public void addFood(int foodCount) {
        this.food += foodCount;
    }

    public boolean enoughFood(int foodCount) {
        return getFood() >= foodCount;
    }
}
