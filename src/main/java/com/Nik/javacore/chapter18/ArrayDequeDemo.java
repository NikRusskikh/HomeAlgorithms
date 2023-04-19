package main.java.com.Nik.javacore.chapter18;

import java.util.ArrayDeque;

// Продемонстрировать применения класса ArrayDeque
public class ArrayDequeDemo {
    public static void main(String[] args) {
        // создать двухстороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();
        // испол ь зовать класс ArrayDeque для организации стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.print("Извлeчeниe из стека : ");
        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
            System.out.println();
        }
    }
}