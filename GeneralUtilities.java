import java.util.Scanner;

public final class GeneralUtilities {

  GeneralUtilities() {
  }

  public int[] lerArray(int tamanho, Scanner sc) {
    int[] arr = new int[tamanho];

    System.out.println("Entre com os valores do array:");
    for (int i = 0; i < tamanho; i++) {
      System.out.printf("\tPosição %d/%d: ", i, tamanho);
      arr[i] = sc.nextInt();
    }

    return arr;
  }

  public int[][] lerMatrix(int tamanho, Scanner sc) {
    int[][] mat = new int[tamanho][tamanho];

    System.out.println("Entre com os valores da matrix:");
    for (int i = 0; i < tamanho; i++) {
      System.out.printf("Linha %d:\n", i);
      for (int j = 0; j < tamanho; j++) {
        System.out.printf("  Posição %d/%d: ", j, tamanho);
        mat[i][j] = sc.nextInt();
      }
    }
    return mat;
  }

  public void imprimirArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(i + ": " + arr[i]);
    }
  }

  public void imprimirMatix(int[][] matx) {
    System.out.println("Valores da matrix:");
    for (int i = 0; i < matx.length; i++) {
      for (int j = 0; j < matx.length; j++) {
        System.out.println("  " + matx[i][j]);
      }
    }
  }
}
