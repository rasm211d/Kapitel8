package OPG8_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] matrix = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +  matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        for (int i = 0; i < matrix[0].length - 1; i++) {
            System.out.println(sumRow(matrix, i));
        }



    }
    public static double sumRow(double[][] m, int rowIndex) {
        double total= 0;
        for (int i = 0; i < 4; i++) {
                total = total + m[rowIndex][i];
        }
        return total;
    }

}