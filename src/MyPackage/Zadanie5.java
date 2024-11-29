package MyPackage;

public class Zadanie5 {
    public static int sumOfDigits(int n) {
        // Базовый случай: если n равно 0, то сумма цифр равна 0
        if (n == 0) {
            return 0;
        }
        // Рекурсивный случай: сумма цифр числа n равна последней цифре плюс сумма цифр оставшейся части
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Сумма цифр числа " + number + " равна " + sumOfDigits(number));
    }
}
