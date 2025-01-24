import java.util.Scanner;

public class revertEachRowMatrix {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Entre com o total de linhas: ");
      int rowSize = sc.nextInt();
      System.out.print("Entre com o total de colunas: ");
      int columnSize = sc.nextInt();

      if (rowSize <= 1 || columnSize <= 1) {
        sc.close();
        throw new Error("Os valores de linha e coluna devem ser maiores que 1.");
      }

      int[][] mat = readMatrix(sc, rowSize, columnSize);
      printMatrix(mat);

      System.out.println();
      mat = revertRowMatx(mat);
      printMatrix(mat);
      sc.close();
    }
    
    public static int[][] revertRowMatx(int[][] mat) {

      for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < (mat[i].length / 2); j++) {
          int aux = mat[i][j];
          mat[i][j] = mat[i][mat[i].length - j - 1];
          mat[i][mat[i].length - j - 1] = aux;
        }
      }

      return mat;
    }

    public static int[][] readMatrix(Scanner sc, int rowSize, int columnSize) {
      int[][] mat = new int[rowSize][columnSize];

      System.out.println("Entre com os valores da matrix:");
      for (int i = 0; i < rowSize; i++) {
        for (int j = 0; j < columnSize; j++) {
          System.out.printf(" Posição %d/%d: ", i, j);
          mat[i][j] = sc.nextInt();
        }
      }

      return mat;
    }

    public static void printMatrix(int[][] mat) {
      System.out.println("Valores da matrix:");
      for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
          System.out.printf("%d ", mat[i][j]);
        }
        System.out.println();
      }
    }
}