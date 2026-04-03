package main.java.strategy.data;

public class DataSet<T> {

    private T[] data;

    public DataSet(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
}

