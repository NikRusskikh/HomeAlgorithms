package Algorithms;

import java.util.*;

public class HomeAlgorithms { public static void main(String[] args) {
    int[] array = {3, 8, 15, 17};
    int[] array1 = {4, 5, 6, 6, 8};
    int[] array2 = {4, 5, 6, 7, 8};
    int Number = 23;
    System.out.println("result = " + Arrays.toString(sumTwoInteger(array, Number)));
    System.out.println("result = " + Arrays.toString(sumTwoIntegerVol2(array, Number)));

    System.out.println(checkArrayDuplicates(array1));
    System.out.println(checkArrayDuplicates(array2));

    System.out.println(checkArrayDuplicatesVol2(array1));
    System.out.println(checkArrayDuplicatesVol2(array2));
}

    public static int[] sumTwoInteger(int[] array, int Number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == Number) {
                    return new int[]{i, j};

                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] sumTwoIntegerVol2(int[] array, int Number) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            int b = Number - a;
            if (map.containsKey(a) && map.get(b) > -1) {
                return new int[]{map.get(b), i};
            }
            map.putIfAbsent(a, i); // запомнить меньший индекс
            map.computeIfAbsent(b, k -> -1);
        }
        throw new RuntimeException("Пара не найдена");
    }


    public static boolean checkArrayDuplicates(int[] array) {
        // для каждого элемента массива проверяем, встречается ли он потом в массиве
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != 0 && array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkArrayDuplicatesVol2(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
}
