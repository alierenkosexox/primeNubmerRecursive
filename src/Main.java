
// Ali Eren KÖSE 28/02/2024 03:06

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        if (isPrime(number))
            System.out.println(number + " bir asal sayıdır.");
        else
            System.out.println(number + " bir asal sayı değildir.");
    }
    public static boolean isPrime(int number) {
        // Negatif sayılar asal değildir
        if (number <= 1)
            return false;
            // 2 asaldır
        else if (number == 2)
            return true;
            // 2'den büyük çift sayılar asal değildir
        else if (number % 2 == 0)
            return false;
            // Diğer sayılar için asal olup olmadığını kontrol et
        else
            return isPrimeRecursive(number, 3);
    }

    public static boolean isPrimeRecursive(int number, int divisor) {
        // Kökten büyük bir bölen bulunamaz, bu yüzden asaldır
        if (divisor > Math.sqrt(number))
            return true;
            // Bölen bulunduğunda asal değildir
        else if (number % divisor == 0)
            return false;
            // Bir sonraki böleni kontrol et
        else
            return isPrimeRecursive(number, divisor + 2);
    }
}