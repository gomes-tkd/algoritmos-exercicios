import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Entre com o valor do array: ");
    int tamanho = sc.nextInt();

    if (tamanho <= 1) {
      throw new Error("Tamanho do array deve ser maior que 1.");
    }

    int[] arr = lerArray(tamanho, sc);

    somarArray(arr);
    sc.close();
  }

  public static int[] lerArray(int tamanho, Scanner sc) {
    int[] arr = new int[tamanho];

    System.out.println("Entre com os valores do array:");
    for (int i = 0; i < tamanho; i++) {
      System.out.printf("\tPosição %d/%d: ", i, tamanho);
      arr[i] = sc.nextInt();
    }

    return arr;
  }

  // Chutei --> mas entendi que o valor sempre será maior que o índex atual
  // Não consegui fazer sem dois laços for
  public static void somarArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        int valor = 0;
        if (i < j) {
          valor = arr[i] + arr[j];
          System.out.println(arr[i] + " + " + arr[j] + " = " + valor);
        }
      }
    }
  }

  public static void imprimirArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(i + ": " + arr[i]);
    }
  }
}
