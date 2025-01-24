import java.util.Scanner;

public class unicosParesSoma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Entre com o tamanho do array: ");
    int size = sc.nextInt();

    if (size <= 1) {
      sc.close();
      throw new Error("O tamanho deve ser maior que 1.");
    }
    
    int[] arr = lerArray(size, sc);

    System.out.print("Entre com o valor da soma: ");
    int valorSoma = sc.nextInt();

    encontrarValoresSoma(arr, valorSoma);
  } 

  public static void encontrarValoresSoma(int[] arr, int valorSoma) {
    for (int i = 0; i < arr.length; i++) {
      int verificarValor = 0;
      for (int j = i + 1; j < arr.length; j++) {
        verificarValor = arr[i] + arr[j];

        if (verificarValor == valorSoma) {
          System.out.printf("(%d, %d)\n", arr[i], arr[j]);
        }
      }
    }
  }

  public static int[] lerArray(int size, Scanner sc) {
    int[] arr = new int[size];

    System.out.println("Entre com os valores:");
    for (int i = 0; i < size; i++) {
      System.out.printf("  Posição %d/%d: ", i, size);
      arr[i] = sc.nextInt();
    }

    return arr;
  }

  public static void printArray(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
