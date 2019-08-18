package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк в массиве и нажмите Enter: ");

        int x = scanner.nextInt();

        System.out.println("Введите число столбцов в массиве и нажмите Enter: ");
        int y = scanner.nextInt();
        int array[][] = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Введите число в строку " + (i + 1) + " столбец " + (j + 1) + " и нажмите Enter: ");
                array[i][j] = scanner.nextInt();
            }
        }
        int count = 1;

        for (int n : array[0]) {

                System.out.println("Вывод " + (count++) + "-го числа, умноженного на 3:");
                System.out.println( n * 3);
            }
        }
    }


