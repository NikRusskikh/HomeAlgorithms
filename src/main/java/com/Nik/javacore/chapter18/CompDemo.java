package main.java.com.Nik.javacore.chapter18;

import java.util.*;

// Использование специального компаратора.
class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
// Обратить сравнение .
        return bStr.compareTo(aStr);
    }
    //Переопределять equals () и методы со стандартной реализацией не требуется
}

// Обратный: компаратор для строк.
public class CompDemo {
    public static void main(String[] args) {

// Создать древовидный набор.
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
// Добавить элементы в древовидный набор.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
// Отобрази'Гь элементы.
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}