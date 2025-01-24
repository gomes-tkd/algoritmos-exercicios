import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countCommomElementsInRows {
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

        int[][] matrix = readMatrix(sc, rowSize, columnSize);

        System.out.println("\nMatriz fornecida:");
        printMatrix(matrix);
        countCommonElements(matrix);
        // System.out.println("\nElementos comuns por linha:");
        // countAndDisplayCommonElements(matrix);

        sc.close();
  }

  /* REFATORADO GPT */
  
  public static void countAndDisplayCommonElements(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        Map<Integer, Integer> frequencyMap = countFrequencies(matrix[i]);

        System.out.println("Linha " + i + ":");
        if (!displayCommonElements(frequencyMap)) {
            System.out.println("  Nenhum elemento comum nesta linha.");
        }
    }
  }

  private static Map<Integer, Integer> countFrequencies(int[] row) {
      Map<Integer, Integer> frequencyMap = new HashMap<>();
      for (int element : row) {
          frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
      }
      return frequencyMap;
  }

  private static boolean displayCommonElements(Map<Integer, Integer> frequencyMap) {
      boolean hasCommonElements = false;
      for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
          if (entry.getValue() > 1) {
              System.out.printf("  Elemento %d - Repetições: %d%n", entry.getKey(), entry.getValue());
              hasCommonElements = true;
          }
      }
      return hasCommonElements;
  }
  
  public static void countCommonElements(int[][] mat) {
    int[] commumElements = new int[mat.length];

    for (int i = 0; i < mat.length; i++) {
      int count = 0;
      for (int j = 0; j < (mat[i].length - 1); j++) {
        if (mat[i][j] == mat[i][j + 1]) {
          count++;
        }
        commumElements[i] = count;
      }
    }

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (commumElements[i] > 0) {
          System.out.println(" Número: " + mat[i][j] + " - Repetições: " + commumElements[i]);
        } else {
          System.out.println(" Não é comum");
        }
      }
    }
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