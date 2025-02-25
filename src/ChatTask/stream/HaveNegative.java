package ChatTask.stream;

import java.util.List;

/*Проверка на отрицательные числа:

Дано List<Integer>. Проверь, есть ли хотя бы одно отрицательное число.*/
public class HaveNegative {
    public static void main(String[] args) {
        List<Integer> n1=List.of(1,2,3);
        List<Integer> n2=List.of(1,-2,3);
        List<Integer> n3=List.of(-11,-2,-40,-50);
        System.out.println(haveNegative(n1));
        System.out.println(haveNegative(n2));
        System.out.println(haveNegative(n3));
    }

    private static boolean haveNegative(List<Integer> n1) {
        return n1.stream().anyMatch(x->x<0);
    }
}
