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
        System.out.println("Вывод матрицы: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.print("Вывод чисел первой  строки, умноженных на 3: ");
                for (int n : array[0]) {

                    System.out.print(n * 3 + "  ");
                }
                System.out.println(" ");
            }
        }




