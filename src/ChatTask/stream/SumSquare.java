package ChatTask.stream;

import java.util.List;

/*Сумма квадратов:

Дано List<Integer>. Найди сумму квадратов всех элементов.*/
public class SumSquare {
    public static void main(String[] args) {
        List<Integer> num=List.of(5,1,2,7,8);
        System.out.println(num.stream().map(x->x*x).reduce(Integer::sum));

    }
}
