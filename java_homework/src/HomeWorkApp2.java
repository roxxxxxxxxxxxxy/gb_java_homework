public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(sum(5,5));
        number(5);
        System.out.println(chekForNegativ(-4));
        printLine(2,"Hello");
        System.out.println(chekLeapYear(2020));
    }

    private static boolean sum(int a, int b){
        int result = a + b;
        return result >= 10 && result <= 20;
    }

    private static void number(int a){
        String result;
        if(a >= 0){
            result = "Пложительное число";
        } else {
            result = "Отрицательное число";
        }
        System.out.println(result);
    }

    private static boolean chekForNegativ(int a){
        return a <= 0;
    }

    private static void printLine(int count,String line){
        for(int x = 0;x < count;x++){
            System.out.println(line);
        }
    }

    private static boolean chekLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        } else {
            return false;
        }
    }
}
