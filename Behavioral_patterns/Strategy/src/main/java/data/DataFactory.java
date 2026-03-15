package data;

import java.util.Random;

public class DataFactory {

    public static Integer[] randomIntegers(int size) {
        Integer[] arr = new Integer[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(1000000);
        }
        return arr;
    }

//    public static String[] randomStrings(int size) {
//        String[] arr = new String[size];
//        Random r = new Random();
//        for (int i = 0; i < size; i++) {
//            arr[i] = "Str" + r.nextInt(10000);
//        }
//        return arr;
//    }

    // the Student class implement Comparable<Student> must be created before
//    public static Student[] randomStudents(int size) {
//        Student[] arr = new Student[size];
//        Random r = new Random();
//        for (int i = 0; i < size; i++) {
//            arr[i] = new Student("Student" + i, r.nextInt(101));
//        }
//        return arr;
//    }

    // randomProducts(), randomBooks(), randomEmployees(), randomOrders()...
}
