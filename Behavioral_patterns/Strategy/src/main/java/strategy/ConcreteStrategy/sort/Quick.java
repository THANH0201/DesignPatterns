package main.java.strategy.ConcreteStrategy.sort;

import main.java.strategy.InterfaceStrategy.SortStrategy;

public class Quick<T extends Comparable<T>> implements SortStrategy<T> {

    @Override
    public void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }
    // Function quickSort: divide array and recursion
    private void quickSort(T[] arr, int low, int high) {
        if (low < high) {

            // 1. divide array base on pivot
            int pivotIndex = partition(arr, low, high);

            // 2. sort left of pivot
            quickSort(arr, low, pivotIndex - 1);

            // 3. sort right of pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Function partition: put pivot on between of left and right
    private int partition(T[] arr, int low, int high) {

        T pivot = arr[high];   // pivot: the last element
        int i = low - 1; // i: the last index of element < pivot
        // scan from low to high - 1
        for (int j = low; j < high; j++) {

            // if element < pivot → put it on left
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                // swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }
        // put pivot on correct position (after elements < pivot)
        swap(arr, i + 1, high);
        return i + 1; // new position of pivot
    }
    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

