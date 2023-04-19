package main.java.com.Nik.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
// Создать списковый массив .
        ArrayList<String> al = new ArrayList<String>();
        System.out.println(" Начальный размер al : " + al.size());
// Добавить элементы в списковый массив .
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "А2");
        System.out.println("Paзмep al после добавления элементов : " + al.size());
// Отобразить списковый массив .
        System.out.println("Coдepжимoe al : " + al);
// Удалить элементы из спискового массива .
        al.remove("F");
        al.remove(2);
        System.out.println(" Paзмep al после удаления элементов : " + al.size());
        System.out.println("Coдepжимoe al : " + al);
    }
}

// Преобразование ArrayList в массив.
class ArrayListToArray {
    public static void main (String [] args) {
// Создать списковый массив .
        ArrayList<Integer> al = new ArrayList<Integer>();
// Добавить элементы в списковый массив.
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Coдepжимoe массива al : " + al);
// Получить массив.
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);
        int sum = 0;
// Просуммировать элементы массива.
        for (int i : ia) sum += i;
        System.out.println("Сумма элементов массива : " + sum);
    }
}

