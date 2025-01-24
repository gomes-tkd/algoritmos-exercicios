import java.util.Scanner;

public class SomarElementosLinhaColuna {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entre com a quantidade de linhas: ");
    int qdtLinha = sc.nextInt();
    System.out.print("Entre com a quantidade de colunas: ");
    int qdtColuna = sc.nextInt();
    if (qdtLinha < 2 || qdtColuna < 2) {
      sc.close();
      throw new Error("O tamanho de colunas e linhas deve ser maior que 2.");
    }

    int[][] matx = lerMatrix(qdtLinha, qdtColuna, sc);
    int[] somaLinha = somarValoresLinha(matx);
    int[] somaColuna = somarValoresColuna(matx, qdtColuna);

    System.out.print("Row Sums: ");
    imprimirResultadoSoma(somaLinha);
    System.out.print("Column Sums: ");
    imprimirResultadoSoma(somaColuna);

    sc.close();
  }

  public static int[] somarValoresLinha(int[][] matx) {
    int[] valoresSoma = new int[matx.length];
    
    for (int i = 0; i < matx.length; i++) {
      int resultado = 0;
      for (int j = 0; j < matx[i].length; j++) {
        resultado += matx[i][j];
      }
      valoresSoma[i] = resultado;
    }

    return valoresSoma;
  }

  public static int[] somarValoresColuna(int[][] matx, int qdtColuna) {
    int[] valoresSoma = new int[qdtColuna];
    
    for (int i = 0; i < qdtColuna; i++) {
      int resultado = 0;
      for (int j = 0; j < matx.length; j++) {
        resultado += matx[j][i];
      }
      valoresSoma[i] = resultado;
    }

    return valoresSoma;
  }

  public static void imprimirResultadoSoma(int[] resultados) {
    for (int i = 0; i < resultados.length; i++) {
      if (i < resultados.length - 1) {
        System.out.print(resultados[i] + ", ");
      } else {
        System.out.print(resultados[i]);
      }
    }
    System.out.println();
  }

  public static int[][] lerMatrix(int qdtLinha, int qdtColuna, Scanner sc) {
    int[][] mat = new int[qdtLinha][qdtColuna];

    System.out.println("Entre com os valores da matrix:");
    for (int i = 0; i < qdtLinha; i++) {
      System.out.printf("Linha %d:\n", i);
      for (int j = 0; j < qdtColuna; j++) {
        System.out.printf("  Posição %d/%d: ", j, i);
        mat[i][j] = sc.nextInt();
      }
    }
    return mat;
  }

  public static void imprimirMatix(int[][] matx) {
    System.out.println("Valores da matrix:");
    for (int i = 0; i < matx.length; i++) {
      for (int j = 0; j < matx[i].length; j++) {
        System.out.print("  " + matx[i][j]);
      }
      System.out.println();
    }
  }

}