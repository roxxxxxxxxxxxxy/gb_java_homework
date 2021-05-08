package homework7;

public class Cat {
    private final String name;
    private final int volume;
    private boolean satiety;

    public Cat(String name, int food) {
        this.name = name;
        this.volume = food;
    }

    public String getName() {
        return name;
    }

    public int getFood() {
        return volume;
    }

    public boolean catSatiety() {
        return satiety;
    }

    public boolean eat(Plate plate) {
        String inference = checkEat(plate);
        if (inference != null) {
            System.out.println(inference);
            return false;
        }
        doEat(plate);
        satiety = true;
        return true;
    }

    private String checkEat(Plate plate) {
        if ( !plate.enoughFood(volume) ) {
            return "Не хватает еды в тарелке!";
        }
        if (satiety) {
            return "Кот сыт!";
        }

        return null;
    }
    private void doEat(Plate plate) {
        plate.reduceFood(volume);
    }

}
