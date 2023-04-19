package main.java.com.Nik.javacore.chapter18;

import java.util.HashSet;

// Продемонстрировать применение класса HashSet
public class HashSetDemo {
    public static void main(String[] args) {
        // создать хеш-множество
        HashSet<String> hs = new HashSet<String>();
        // ввести элементы в хеш-множество
        hs.add("Бета");
        hs.add("Aльфa");
        hs.add("Этa");
        hs.add("Гaммa");
        hs.add("Эпсилон");
        hs.add("Oмeгa");
        System.out.println(hs);
    }
}
