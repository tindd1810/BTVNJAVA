package B5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //BTVN: Tổng chia hết cho 3
        System.out.println("Nhap so cot matran A: ");
        int colA = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so dong matran A: ");
        int rowA = Integer.parseInt(scanner.nextLine());
        int arrA [][] = new int[rowA][colA];

        System.out.println("Nhap gia tri matrixA: ");
        inputMatrix(scanner,arrA);

        System.out.println("MatrixA: ");
        printMatrix(arrA);

        int sum = sumDiv3(arrA);
        System.out.println("Tổng số chia hết cho 3: " + sum);




        //BTVN: row=col
/*        System.out.println("Nhap so cot matran A: ");
        int colA = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so dong matran A: ");
        int rowA = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot matran B: ");
        int colB = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so dong matran B: ");
        int rowB = Integer.parseInt(scanner.nextLine());
        int arrA [][] = new int[rowA][colA];
        int arrB [][] = new int[rowB][colB];
        if (colA == colB && rowA == rowB) {
            System.out.println("Nhap gia tri matrixA: ");
            inputMatrix(scanner, arrA);

            System.out.println("Nhap gia tri matrixB: ");
            inputMatrix(scanner, arrB);

            //In matrix A,B
            System.out.println("MatrixA: ");
            printMatrix(arrA);

            System.out.println();

            System.out.println("MatrixB : ");
            printMatrix(arrB);

            //sum matrix
            int sumMatrix[][] = sumMatrix(arrA, arrB);

            //In matrix sau khi sum
            System.out.println("Matrix sau khi sum:");
            printMatrix(sumMatrix);

        } else {
            System.out.println("Số cột và số hangf 2 matrix không bằng nhau!!!");
        }*/


    }

    public static int[][] inputMatrix(Scanner scanner, int matrix[][]) {
/*        System.out.println("Nhập số cột: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int col = Integer.parseInt(scanner.nextLine());*/
//        int matrix[][] = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Nhập giá trị cột "+(i+1)+" và dòng "+(j+1));
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        return matrix;
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    // sum chia het cho 3
    public static int sumDiv3(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] % 3 == 0) {
                    sum+= matrix[i][j];
                }
            }
        }
        return sum;
    }

    // sum 2 matrix
    public static int[][] sumMatrix(int matrixA[][], int matrixB[][]) {
        int sumMatrix[][] = new int[matrixA.length][matrixA.length];
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix.length; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sumMatrix;
    }

}
