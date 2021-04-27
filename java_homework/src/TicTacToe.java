import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 5;
    private static final char[][] map = new char[SIZE][SIZE];
    private static final int DOTS_TO_WIN = 4;
    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            compTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char symb) {
        if (chekRowColumn(symb)) {
            return true;
        }
        else return chekDiag(symb);
    }

    private static boolean chekDiag(char symb) {
        int leftDiag = 0;
        int rightDiag = 0;
        for (int i = 0; i < SIZE; i++) {
            leftDiag = (map[i][i] == symb) ? leftDiag + 1 : 0;
            rightDiag = (map[i][map.length - 1 - i] == symb) ? rightDiag + 1 : 0;
            if (leftDiag == DOTS_TO_WIN || rightDiag == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean chekRowColumn(char symb) {
        int line = 0;
        int column = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                line = (map[i][j] == symb) ? line + 1 : 0;
                column = (map[j][i] == symb) ? column + 1 : 0;
                if (line == DOTS_TO_WIN || column == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void compTurn() {
        int x, y;
        Random random = new Random();
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (map[x][y] != DOT_EMPTY);
        map[x][y] = DOT_O;
    }

    private static void humanTurn() {
        int x, y;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите координаты в форме X Y");
            x = readInt(sc) - 1;
            y = readInt(sc) - 1;
            if (x == -1 || y == -1) {
                System.out.println("Координаты должны быть числом");
                sc.nextLine();
            } else if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Данные введены некорректрно");
            } else if (map[x][y] != DOT_EMPTY) {
                System.out.println("Клетка уже занята");
            } else {
                break;
            }
        } while (true);

        map[x][y] = DOT_X;
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int readInt(Scanner sc) {
        return sc.hasNextInt() ? sc.nextInt() : 0;
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }
}
