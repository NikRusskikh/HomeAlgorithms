package main.java.com.Nik.javacore.chapter18;

import java.util.Arrays;


// Продемонстрировать применения некоторых методов из класса Arrays
public class ArraysDemo {
    public static void main(String[] args) {
        //выделить и инициализировать массив
        int array[] = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;
        //вывести , отсортировать и снова вывести содержимое массива
        System.out.print("Иcxoдный массив : ");
        display(array);
        Arrays.sort(array);
        System.out.print("Oтcopтиpoвaнный массив : ");
        display(array);
        // залолнить массив и вывести его соде ржимое
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Maccив после вызова метода fill(): ");
        display(array);
// отсортиро вать и вывести содержимое массива
        Arrays.sort(array);
        System.out.print("Maccив после п о в т о рн ой сортировки : ");
        display(array);
// выполнить двоичный поиск значения -9
        System.out.print(" Знaчeниe -9 находи тся на позиции ");
        int index =
                Arrays.binarySearch(array, -9);
        System.out.println(index);
    }
        static void display ( int array[]){
            for (int i : array)
                System.out.print(i + " ");
            System.out.println();
        }
    }
