import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entre com o valor do array: ");
    int sizeArr = scanner.nextInt();
    int[] arr = new int[sizeArr];

    readArray(arr, scanner);
    System.out.println("Array Original:");
    printArray(arr);

    arr = inverterArray(arr);
    System.out.println("Array Invertido:");
    printArray(arr);

    scanner.close();
  }

  public static void readArray(int[] arr, Scanner sc) {
    System.out.println("Entre com os valores:");
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("  Entre com o valor %d/%d: ", i + 1, arr.length);
      arr[i] = sc.nextInt();
    }
    System.out.println();
  }

  public static void printArray(int[] arr) {
    System.out.println("Imprimindo os valores:");
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("  Posição %d/%d: %d\n", i, arr.length, arr[i]);
    }
    System.out.println();
  }

  public static int[] inverterArray(int[] arr) {

    for (int i = 0; i < (arr.length - 1); i++) {
      int aux = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = aux;
    }

    return arr;
  }

}