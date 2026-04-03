package main.java.strategy.ConcreteStrategy.sort;

import main.java.strategy.InterfaceStrategy.SortStrategy;

import java.util.Arrays;

public class Merge<T extends Comparable<T>> implements SortStrategy<T> {

    @Override
    public void sort(T[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(T[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            // 1. divide array to left and right
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // 2. merge arrays
            merge(arr, left, mid, right);
        }
    }

    private void merge(T[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        T[] L = Arrays.copyOfRange(arr, left, mid + 1);
        T[] R = Arrays.copyOfRange(arr, mid + 1, right + 1);

        // copy data into left and right
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        // merge left or right into array
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy maintenance of left
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // copy maintenance of right
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

