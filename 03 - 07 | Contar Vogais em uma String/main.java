import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Entre com a string: ");
      String st = sc.nextLine();

      int total = countVowel(st);
      System.out.println(total);

      sc.close();
    }

    public static int countVowel(String st) {
      List<Character> vowels = new ArrayList<>(); 
      vowels.add('a');
      vowels.add('e');
      vowels.add('i');
      vowels.add('o');
      vowels.add('u');

      int count = 0;
      st = st.toLowerCase();

      for (int i = 0; i < st.length(); i++) {
        if (vowels.contains(st.charAt(i))) {
          count++;
        }
      }

      return count;
    }
}