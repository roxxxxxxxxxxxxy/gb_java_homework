import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        changeArr();
        fillArray();
    }

    private static void changeArr() {
        int[] arr = {1, 0, 0, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i]++;
            } else {
                arr[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
        }
        System.out.println(Arrays.toString(hundred));
    }


}
