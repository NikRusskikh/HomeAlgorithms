package main.java.com.Nik.javacore.chapter18;

import java.util.ArrayList;

// Использование цикла for в стиле "for-each" для: прохода по коллекции.
public class FprEachDemo {
    public static void main(String[] args) {
// Создать списковый массив дЛЯ целых чисел .
        ArrayList<Integer> vals = new ArrayList<Integer>();
// Добавить значения в списковый массив.
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // Использовать цикл for для отображения значений.
        System.out.print("Содержимое vals : ");
        for (int v : vals)
            System.out.print(v + " ");
        System.out.println();
// Просуммировать значения с применением цикла for.
        int sum = 0;
        for (int v : vals)
            sum += v;
        System.out.println("Cyммa значений : " + sum);
    }
}
