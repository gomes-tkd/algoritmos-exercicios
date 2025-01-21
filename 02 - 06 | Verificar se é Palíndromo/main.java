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
      String stLimpa = st.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

      for (int i = 0; i < (stLimpa.length() / 2); i++) {
        char stInicio = stLimpa.charAt(i);
        char stFinal = stLimpa.charAt(stLimpa.length() - i - 1);

        if (stInicio != stFinal) {
          return false;
        } 
      }

      return true;
    }
}