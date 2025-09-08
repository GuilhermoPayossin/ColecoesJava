package exercicio03;

import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> contador = new HashMap<>();
        String frase;

        System.out.print("Informe uma frase --> ");
        frase = sc.nextLine();
        for (char c : frase.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                contador.put(c, contador.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        System.out.println();
        Set<Character> chave = contador.keySet();
        TreeSet<Character> arvore = new TreeSet<>(chave);
        for (Character c : arvore) {
            System.out.println(c + " --> " + contador.get(c));
        }
    }
}
