public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        chekSumSing();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("_Orange\n_Banana\n_Apple");
    }


    public static void chekSumSing() {
        int a = 5;
        int b = 6;
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


    public static void printColor() {
        int value = -5;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }


    public static void compareNumbers() {
        int a = 10;
        int b = 50;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}