package ConcreteStrategy.sort;

import InterfaceStrategy.SortStrategy;

public class Select<T extends Comparable <T>> implements SortStrategy<T> {
    @Override
    public void sort(T[] array) {
        int n = array.length;
        // in n loops:(increasing)
        for (int i = 0; i < n - 1; i++) {
            // 1. find index with min value  element of array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // 2. swap after end j loop, there are max n-1 swaps
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

