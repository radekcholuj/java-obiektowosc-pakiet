package pl.radekcholuj.permutation;

public class GFG {

    static void printPermutn2(String[] words, String ans) {
        // If string is empty
        if (words.length == 0) {
            System.out.println(ans + ",");
            return;
        }

        String word;
        for (int i = 0; i < words.length; i++) {

            // ith character of str
            word = words[i];

            // Rest of the string after excluding
            // the ith character
            String[] ros = new String[words.length - 1];
            int k = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j] != word) {
                    ros[k++] = words[j];
                }
            }

            // Recurvise call
            printPermutn2(ros, ans + word);
        }
    }
}
