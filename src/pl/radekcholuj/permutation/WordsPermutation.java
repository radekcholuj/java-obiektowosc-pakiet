package pl.radekcholuj.permutation;

import java.util.Scanner;

public class WordsPermutation {

    private static Scanner scanner = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {

        int number = insertNumber();
        String[] words = insertWords(number);
        GFG.printPermutn2(words,"");

        scanner.close();
    }

    private static String[] insertWords(int number) {
        String[] words = new String[number];
        for(int i = 0; i < words.length; i++){
            System.out.println("Word "+(i+1)+": ");
            words[i] = scanner.nextLine();
        }

        return words;
    }

    private static int insertNumber() {
        int number;
        do {
            System.out.print("Number of words: ");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number < 2 || number > 5);

        return number;
    }
}
