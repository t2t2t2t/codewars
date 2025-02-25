package ChatTask.stream;

import java.util.List;

/*Первые N элементов:

Дано List<Integer>. Верни первые 5 элементов списка.*/
public class FirstFive {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,1354,1568);
        numbers.stream().limit(5).forEach(System.out::println);
    }
}
