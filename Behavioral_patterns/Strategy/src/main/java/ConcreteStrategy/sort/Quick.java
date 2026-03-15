package ConcreteStrategy.sort;

import InterfaceStrategy.SortStrategy;

public class Quick<T extends Comparable<T>> implements SortStrategy<T> {

    @Override
    public void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }
    // Function quickSort: chia mảng và đệ quy sắp xếp
    private void quickSort(T[] arr, int low, int high) {
        if (low < high) {

            // 1. Chia mảng theo pivot → trả về vị trí pivot sau khi sắp xếp đúng
            int pivotIndex = partition(arr, low, high);

            // 2. Sắp xếp phần bên trái pivot
            quickSort(arr, low, pivotIndex - 1);

            // 3. Sắp xếp phần bên phải pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Hàm partition: đặt pivot vào đúng vị trí và chia mảng thành 2 phần
    private int partition(T[] arr, int low, int high) {

        T pivot = arr[high];   // chọn pivot là phần tử cuối
        int i = low - 1;         // i sẽ là vị trí cuối cùng của phần tử < pivot
        // duyệt từ low đến high - 1
        for (int j = low; j < high; j++) {

            // nếu phần tử nhỏ hơn pivot → đưa nó sang bên trái
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                // đổi chỗ arr[i] và arr[j]
                swap(arr, i, j);
            }
        }
        // đưa pivot về đúng vị trí (sau tất cả phần tử nhỏ hơn nó)
        swap(arr, i + 1, high);
        return i + 1; // vị trí mới của pivot
    }
    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

