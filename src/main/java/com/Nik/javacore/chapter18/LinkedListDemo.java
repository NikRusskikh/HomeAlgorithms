package main.java.com.Nik.javacore.chapter18;

import java.util.LinkedList;

// Демонстрация исполь зования LinkedList .
public class LinkedListDemo {
    public static void main(String[] args) {
// Создать связный список .
        LinkedList<String> ll = new LinkedList<String>();
// Доба вить элементы в свя зный список.
        ll.add(" F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z ");
        ll.addFirst("A");
        ll.add(1, "А2");
        System.out.println("Иcxoднoe содержимое 11 : " + ll);
// Удалить элементы из связного списка .
        ll.remove("F");
        ll.remove(2);
        System.out.println("Coдepжимoe 11 после удаления : " + ll);
        ll.removeFirst();
        ll.removeLast();
        System. out .println ( "Содержимое 11 после удаления первого и последнего элементов : "+ ll);
// Получить и установить значение.
        String val = ll.get(2 );
        ll. set(2 , val + " изменено" );
        System.out . println ("Coдepжимoe 11 после изменения: "+ ll);
    }
}


