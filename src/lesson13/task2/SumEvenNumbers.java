package lesson13.task2;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа N
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int sum = 0;

        // Проходим по числам от 0 до N
        for (int i = 0; i <= N; i++) {
            // Проверка на чётность
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // Вывод результата
        System.out.println("Сумма чётных чисел от 0 до " + N + " равна: " + sum);

        scanner.close();
    }
}





