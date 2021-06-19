package kata.mc;

import java.util.stream.Collectors;

/**
        Trolls are attacking your comment section!
        A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
        Your task is to write a function that takes a string and return a new string with all vowels removed.
        For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
        Note: for this kata y isn't considered a vowel.
**/


public class DisemvowelTrolls {

    public static void main(String[] args) {
        String comment = "Dear, dear sister; if you are my girl, maybe I would love Thee true. Fade not.";
        disemvowel(comment);
        System.out.println(disemvowel(comment));

//Vowels Ae, Oo, Uu, Ii, Ee
    }


        public static String disemvowel(String str) {
            String vowels = "aeiouAEIOU";
            return str.chars().filter(c -> vowels.indexOf(c) == -1).mapToObj(c->""+(char)c).collect(Collectors.joining(""));
        }
    }

// clever
//return str.replaceAll("(?i)[aeiou]" , "");
//}

/*
comment.contains("O") ||
comment.contains("o") ||
comment.contains("U") ||
comment.contains("u") ||
comment.contains("I") ||
comment.contains("i") ||
comment.contains("E") ||
comment.contains("e")

 */