package Ultimate_Java_Masterclass.Problem4;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class question7 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Orginal Tree Set is "+set);

        TreeSet set2 = new TreeSet(set);

        System.out.println("Cloned Tree Set is "+set2);

    }
}