package ChatTask.tree;

import java.util.TreeSet;

/*Ранг числа:

Дан TreeSet<Integer>. Найди, сколько чисел меньше заданного.
Пример: set = [2, 5, 8, 10] и x = 7 → 2*/
public class HowMutchLower {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet= new TreeSet<>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(9);
        treeSet.add(25);
        System.out.println(howMuchLower(treeSet,5));
    }
    public static long howMuchLower(TreeSet<Integer> tree,int n){

        return tree.stream().filter(x->x<n).count();
    }
}
