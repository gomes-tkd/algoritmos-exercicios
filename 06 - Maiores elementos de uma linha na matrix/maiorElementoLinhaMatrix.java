import java.util.Scanner;

public class maiorElementoLinhaMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Entre com o tamanho do array: ");
    int tamanho = sc.nextInt();

    if (tamanho <= 1) {
      sc.close();
      throw new Error("O Valor deve ser maior que 1.");
    }

    int[][] matx = lerMatrix(tamanho, sc);

    maiorValorPorLinha(matx);

    sc.close();
  }  

  public static void maiorValorPorLinha(int[][] matx) {
    for (int i = 0; i < matx.length; i++) {
      int maiorValorLinha = -999999999;
      for (int j = 0; j < matx.length; j++) {
        if (maiorValorLinha <= matx[i][j]) {
          maiorValorLinha = matx[i][j];
        }
      }
      System.out.println(maiorValorLinha);
    }
  }

  public static int[][] lerMatrix(int tamanho, Scanner sc) {
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

  public static void imprimirMatix(int[][] matx) {
    System.out.println("Valores da matrix:");
    for (int i = 0; i < matx.length; i++) {
      for (int j = 0; j < matx.length; j++) {
        System.out.print("  " + matx[i][j]);
      }
      System.out.println();
    }
  }
}