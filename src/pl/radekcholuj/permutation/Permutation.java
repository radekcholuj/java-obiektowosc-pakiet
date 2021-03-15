package pl.radekcholuj.permutation;

public class Permutation {
    public static void main(String[] args) {
        permute("ABC");
    }
    public static void permute(String full){
        if(full == null || full.length() == 0){
            System.out.println("Permutation");
            return;
        }
        permute("",full);
    }
    private static void permute (String pref, String poz ){
        if(poz.length() == 0){
            System.out.println(pref);
            return;
        }
        for (int i = 0; i < poz.length(); i++ ){
            permute(pref + poz.charAt(i), poz.substring(0, i) + poz.substring(i+1, poz.length()));
        }
    }
}