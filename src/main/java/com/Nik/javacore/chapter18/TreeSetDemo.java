package main.java.com.Nik.javacore.chapter18;

import java.util.TreeSet;

// Продемонстрировать применение класса TreeSet
public class TreeSetDemo {
    public static void main(String[] args) {
        // создать дре вовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<String>();
        // ввести элементы в древовидное множество типа TreeSet
        ts.add("C");
        ts.add("A");
        ts.add(" B ");
        ts.add(" E");
        ts.add(" F");
        ts.add(" D ");
        System.out.println(ts);
    }
}
