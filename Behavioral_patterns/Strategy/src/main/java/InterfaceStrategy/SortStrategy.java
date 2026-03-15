package InterfaceStrategy;

public interface SortStrategy<T extends Comparable<T>> {
    public void sort(T[] array);
}
