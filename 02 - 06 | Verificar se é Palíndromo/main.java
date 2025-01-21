import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Entre com a palavra: ");
      String st = sc.nextLine();

      boolean palindrome = verificarPalindrome(st);

      System.out.println("É palíndrome: " + palindrome);

      sc.close();
    }

    public static boolean verificarPalindrome(String st) {
      boolean ePalindrome = false;
      for (int i = 0; i < (st.length()); i++) {
        char stInicio = st.toLowerCase().charAt(i);
        char stFinal = st.toLowerCase().charAt(st.length() - i - 1);

        if (stInicio == stFinal) {
          ePalindrome = true;
        } else {
          ePalindrome = false;
        }
      }

      return ePalindrome;
    }
}