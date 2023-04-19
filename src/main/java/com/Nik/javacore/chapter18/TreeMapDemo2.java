package main.java.com.Nik.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Исполь зование компаратора для сортировки счетов по фамилии владельца.

// Сравнивает последние полные слов а в двух строках .

class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {

        int i, j, k;
        // Найти индекс , начинающийся с фамилии .
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) // фамилии совпадают , проверить полное имя
            return aStr.compareToIgnoreCase(bStr);
        else
            return k;
    }

// Переопределять equals () не нужно .
}

public class TreeMapDemo2 {
    public static void main(String[] args) {
// Создать древовидную карту.
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());
// Поместить элементы в карту .
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);
// Получить набор элементов .
        Set<Map.Entry<String, Double>> set = tm.entrySet();
// От образить элементы.
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //Пополнить счет клиента JohnDoe на 1000 .
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);
        System.out.println("Hoвый баланс клиента John Doe : " + tm.get("John Doe"));
    }
}
