package ConcreteStrategy.sort;

import InterfaceStrategy.SortStrategy;

import java.util.Arrays;

public class Merge<T extends Comparable<T>> implements SortStrategy<T> {

    @Override
    public void sort(T[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(T[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            // 1. Chia mảng thành 2 nửa
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // 2. Gộp 2 nửa đã sắp xếp
            merge(arr, left, mid, right);
        }
    }

    private void merge(T[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        T[] L = Arrays.copyOfRange(arr, left, mid + 1);
        T[] R = Arrays.copyOfRange(arr, mid + 1, right + 1);

        // copy dữ liệu vào mảng trái và phải
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        // gộp 2 mảng L và R vào arr
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

        // copy phần còn lại của L
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // copy phần còn lại của R
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

