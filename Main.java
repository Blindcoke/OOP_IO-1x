package com.company;

/*
C=A×B
long
Знайти середнє значення елементів кожного рядка матриці
 */
public class Main {

    public static void main(String[] args) {
        long[][] matrixA = new long[][]{
                {1497L, -457L, 124L, -949L, 454L, 123L},
                {1L, -2L, 3L, -4L, 5L, 6L},
                {105L, -457L, 654L, 11L, 775L, -20L},
                {-156L, -516L, -7847L, -647L, -112L, -687L},
                {875L, 1654L, 7567L, 457L, 7645L, 434L}};
        System.out.println("Матриця А:");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        long[][] matrixB = new long[][]{
                {1547L, -54L, 1L, -28L, 74L},
                {11L, 12L, 13L, 14L, 15L},
                {-23L, 53L, 434L, 0L, 85L},
                {-155L, -5L, -7841L, -64L, -112L},
                {586L, 467L, 744L, 41L, 7477L},
                {5L, 46L, 74L, 1L, 77L}};
        System.out.println("Матриця B:");
        for (int m = 0; m < matrixB.length; m++) {
            for (int n = 0; n < matrixB[m].length; n++) {
                System.out.print(matrixB[m][n] + " ");
            }
            System.out.println();
        }
        long[][] matrixC = new long[5][5];
        System.out.println("Матриця C:");
        for (int i = 0; i < matrixC.length; i++) { //Matrix multiplication
            for (int j = 0; j < matrixC[i].length; j++) {
                for (int k = 0; k < matrixA[i].length; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
        long[] avarage = new long[matrixC.length];
        for (int i = 0; i < matrixC.length; i++) {
            long sum = 0;
            long q = 0;
            for (int j = 0; j < matrixC[i].length; j++) {
                sum += matrixC[i][j];
                q += 1;
            }
            avarage[i] = sum / q;
        }
        System.out.println("Середні значення в кожному рядку:");
        for (int i = 0; i < avarage.length; i++) {
            System.out.print(avarage[i] + " ");
        }
    }


}

