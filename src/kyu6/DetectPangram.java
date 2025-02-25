package kyu6;

import java.util.Locale;
import java.util.stream.Collectors;

/*A pangram is a sentence that contains every
single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a
pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram.
Return True if it is, False if not. Ignore numbers and punctuation.
*/
public class DetectPangram {
    public static void main(String[] args) {
        System.out.println(check( "The quick brown fox jumps over the lazy dog."));
        System.out.println(check( "no Pangram"));
        System.out.println(check("You shall not pass!"));


    }

        public static boolean check(String sentence){
            System.out.println(sentence.toLowerCase().replace(" ","").replace(".","").replace("!","").chars().distinct().count());
            return sentence.toLowerCase().replaceAll("[^\\p{L}]","").chars().distinct().count()==26;
        }

}
