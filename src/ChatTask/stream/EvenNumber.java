package ChatTask.stream;
/*
* Четные числа:

Дано List<Integer>. Оставь только чётные числа.
Первые N элементов:*/

import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> number=List.of(2,5,8,153458,13,57,33,12,66);
        number.stream().filter(x->x%2==0).forEach(System.out::println);
    }
}
