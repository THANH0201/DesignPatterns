package context;

import InterfaceStrategy.SortStrategy;

public class SortContext<T extends Comparable<T>> {
    private SortStrategy<T> strategy;

    public void setStrategy(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void executeSort(T[] array) {
        strategy.sort(array);
    }
}
