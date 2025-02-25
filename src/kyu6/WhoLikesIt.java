package kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        switch (names.length){
            case(0):
                return "no one likes this";
            case (1):
                return names[0]+" likes this";
            case(2):
                return String.format("%s and %s like this",names[0],names[1]);
            case(3):
                return String.format("%s, %s and %s like this",names[0],names[1],names[2]);
            default:
                return String.format("%s, %s and %d others like this",names[0],names[1],names.length-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
