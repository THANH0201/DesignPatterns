package main.java.strategy;


import main.java.strategy.ConcreteStrategy.sort.Bubble;
import main.java.strategy.ConcreteStrategy.sort.Merge;
import main.java.strategy.ConcreteStrategy.sort.Quick;
import main.java.strategy.ConcreteStrategy.sort.Select;
import main.java.strategy.InterfaceStrategy.SortStrategy;
import main.java.strategy.context.SortContext;
import main.java.strategy.data.DataFactory;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // create 2 arrays of data
        Integer[] smallArray = DataFactory.randomIntegers(300);
        Integer[] largeArray = DataFactory.randomIntegers(100000);

        // List of algorithm sort
        SortStrategy<Integer>[] strategies = new SortStrategy[]{
                new Bubble<>(),
                new Select<>(),
                new Quick<>(),
                new Merge<>()
        };

        // create object Sort sortContext
        SortContext<Integer> sortContext = new SortContext<>();

        // run strategy in list and measure time
        for (SortStrategy<Integer> s : strategies) {

            System.out.println("=== " + s.getClass().getSimpleName() + " ===");

            // small dataset
            Integer[] smallCopy = Arrays.copyOf(smallArray, smallArray.length); // each algorithm sort runs with the copy from origin array
            long startSmall = System.currentTimeMillis();
            sortContext.setStrategy(s);
            sortContext.executeSort(smallCopy);
            long endSmall = System.currentTimeMillis();
            long tSmall = endSmall - startSmall;

            System.out.println("Small array: " + tSmall + " ms");

            // large dataset
            Integer[] largeCopy = Arrays.copyOf(largeArray, largeArray.length);
            long startLarge = System.currentTimeMillis();
            sortContext.setStrategy(s);
            sortContext.executeSort(largeCopy);
            long endLarge = System.currentTimeMillis();
            long tLarge = endLarge - startLarge;
            System.out.println("Large array: " + tLarge + " ms");

            System.out.println();
        }
    }
}
