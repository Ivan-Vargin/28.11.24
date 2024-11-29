package MyPackage;

public class Zadanie6 {
    public static boolean isPrime(int n, int divisor) {
        // Базовый случай 1: если n меньше или равно 3, то проверяем на 2 и 3
        if (n <= 3) {
            return n > 1;
        }
        // Базовый случай 2: если n делится на текущий делитель, то оно составное
        if (n % divisor == 0) {
            return false;
        }
        // Базовый случай 3: если делитель больше корня из n, то n простое
        if (divisor * divisor > n) {
            return true;
        }
        // Рекурсивный случай: проверяем следующий делитель
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        int number = 29; // Пример числа для проверки
        if (isPrime(number, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
