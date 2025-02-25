package ktu8;

import java.util.stream.Collectors;

public class StringToNumber {
    public static int stringToNumber(String str) {
        Integer integer = new Integer(str);
        return integer;
    }

    public static void main(String[] args) {
        System.out.println(stringToNumber("1405"));
    }
}
