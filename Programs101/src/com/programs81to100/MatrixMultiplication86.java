package com.programs81to100;

import java.util.Scanner;

public class MatrixMultiplication86 {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int rows1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int columns1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int rows2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int columns2 = sc.nextInt();

        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] a = new int[rows1][columns1];
        int[][] b = new int[rows2][columns2];
        int[][] result = new int[rows1][columns2];

        System.out.println("Enter first matrix:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] = result[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}