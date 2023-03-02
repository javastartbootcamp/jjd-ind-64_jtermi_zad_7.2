package pl.javastart.task;

import java.util.Arrays;

public class Main {

    // uzupełnij metodę BubbleSort.sort()
    // poniżej przykładowe wydruki
    // to zadanie ma dostępne testy jednostkowe w src/test/java/[...]/BubbleSortTest
    public static void main(String[] args) {
        sortAndPrintInfo(1, 2, 3, 4, 5);
        sortAndPrintInfo(5, 4, 3, 2, 1);
        sortAndPrintInfo(5, 2, 3, 1, 4);

        int[] array1 = new int[99];
        int[] array2 = new int[99];

        for (int i = 0; i < 99; i++) {
            array1[i] = i + 1;
            array2[i] = 99 - i;
        }

        sortAndPrintInfo(array1);
        sortAndPrintInfo(array2);

    }

    private static void sortAndPrintInfo(int... arrayToSort) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("=================");
        System.out.printf("Przed sortowaniem: %s\n", Arrays.toString(arrayToSort));

        int compareCount = bubbleSort.sort(arrayToSort);

        System.out.printf("Po sortowaniu: %s\n", Arrays.toString(arrayToSort));
        System.out.printf("Liczba porównań: %d\n", compareCount);
        System.out.println("=================");
    }
}
