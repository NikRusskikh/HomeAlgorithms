package main.java.com.Nik.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// Продемонстрировать применение различных алгоритмов коллекций
public class AlgorithmsDemo {
    public static void main(String[] args) {

        // создать неинициализированный связный список
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        // создать компаратор с обратным упорядочением
        Comparator<Integer> r = Collections.reverseOrder();
        // отсортировать список с помощью этого компаратора
        Collections.sort(ll, r);
        System.out.print("Cпиcoк отсортирован в обра тном порядке : ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        // перетасовать список
        Collections.shuffle(ll);
        // вывести перетасованный список
        System.out.print("Cпиcoк перетасован : ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        System.out.println(" Mинимyм : " + Collections.min(ll));
        System.out.println("Maкcимyм : " + Collections.max(ll));
    }
}
