package kata.mc;

import java.util.stream.Collectors;

public class Troll {
    public static void main(String[] args) {
        String trollComment = "Nie zesraj się";
        System.out.println(noTroll(trollComment));

    }
    public static String noTroll(String str){
        return str.replaceAll("(?i)[aeiou]" , "");
    }

    public static String disemvowel(String str) {
        String vowels = "aeiouAEIOU";
        return str.chars().filter(c -> vowels.indexOf(c) == -1).mapToObj(c->""+(char)c).collect(Collectors.joining(""));
    }
}

