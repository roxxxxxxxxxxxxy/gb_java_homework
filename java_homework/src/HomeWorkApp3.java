import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        changeArr();
        fillArray();
        multiplyNum();
        fillDiagonal();
        System.out.println(Arrays.toString(fillArr(2, 4)));
        maxNumber();
    }

    private static void changeArr() {
        int[] num = {1, 0, 0, 0, 0, 1};
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                num[i]++;
            } else {
                num[i]--;
            }
        }
        System.out.println(Arrays.toString(num));
    }

    public static void fillArray() {
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
        }
        System.out.println(Arrays.toString(hundred));
    }

    public static void multiplyNum() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillDiagonal() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[] fillArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void maxNumber() {
        int[] nums = {2, 5, 6, 4, 8, 9, 7, 3, 1};
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
