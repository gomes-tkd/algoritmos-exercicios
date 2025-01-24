import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countFrequencyCharacter {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    System.out.print("Entre com a string: ");
    String st = sc.nextLine();

    if (st.length() <= 1) {
        sc.close();
        throw new IllegalArgumentException("A String deve ter mais de 1 caracter.");
    }

    HashMap<Character, Integer> frequencyMap = countFrequencies(st); // Conta as frequências dos caracteres

    System.out.println("Frequências dos caracteres:");
    displayCommonElements(frequencyMap); // Exibe os caracteres com mais de 1 repetição

    sc.close();
    }

    /* ADAPTEI O EXERCÍCIO 8 */

    public static HashMap<Character, Integer> alphabet() {
      HashMap<Character, Integer> alpha = new HashMap<Character, Integer>();

      for (int i = 0; i < 26; i++) {
        char letter = (char) ('a' + i);
        alpha.put(letter, 0); 
      }

      for (int i = 0; i < 26; i++) {
        char letter = (char) ('A' + i);
        alpha.put(letter, 0); 
      }

      return alpha;
    }

    public static HashMap<Character, Integer> countFrequencies(String st) {
      HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
      for (Character element : st.toCharArray()) {
        frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
      }
      return frequencyMap;
    }

    private static boolean displayCommonElements(Map<Character, Integer> frequencyMap) {
      boolean hasCommonElements = false;
      for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
          if (entry.getValue() > 1) {
              System.out.printf("  Elemento %c - Repetições: %d%n", entry.getKey(), entry.getValue());
              hasCommonElements = true;
          }
      }
      return hasCommonElements;
  }
}