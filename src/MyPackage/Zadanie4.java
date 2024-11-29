package MyPackage;

public class Zadanie4 {
    public static int countNumbersWithSum(int k, int d) {
        return countNumbers(k, d, 0, 0);
    }

    private static int countNumbers(int k, int d, int currentSum, int position) {
        // Базовый случай: если достигли последней цифры
        if (position == k) {
            return (currentSum == d) ? 1 : 0;
        }

        int count = 0;
        int startDigit = (position == 0) ? 1 : 0; // Первая цифра не может быть 0

        for (int digit = startDigit; digit <= 9; digit++) {
            count += countNumbers(k, d, currentSum + digit, position + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int k = 3; // Количество цифр
        int d = 15; // Заданная сумма цифр

        int result = countNumbersWithSum(k, d);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + d + ": " + result);
    }
}
