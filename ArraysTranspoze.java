package patikadev;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTranspoze {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };
        int col = matrix.length;
        int row = matrix[0].length;
        int[][] transpoze = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpoze[j][i] = matrix[i][j];
            }
        }
        for (int[] i : transpoze) {
            for (int u : i) {
                System.out.print(u + "  ");
            }
            System.out.println();
        }
    }
}
