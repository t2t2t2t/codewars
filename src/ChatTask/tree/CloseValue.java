package ChatTask.tree;

import java.util.TreeSet;

/*
* Поиск ближайшего числа:

Дан TreeSet<Integer>. Напиши метод, который вернёт ближайшее число к заданному.
Пример: set = [1, 4, 6, 8] и x = 5 → 4*/
public class CloseValue {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet= new TreeSet<>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(9);
        treeSet.add(25);
        System.out.println(closeValue(treeSet,5));
        System.out.println(closeValue(treeSet,7));
        System.out.println(closeValue(treeSet,20));
    }
    public static int closeValue(TreeSet tree,int n){
        int lower= (int)tree.lower(n);
        int higher= (int)tree.higher(n);
        return Math.abs(lower-higher)>Math.abs(lower-higher)?lower:higher;
    }
}
