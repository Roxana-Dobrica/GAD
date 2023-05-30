package DesignPatterns.Strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);
    }

    public static void displaySorted(SortingStrategy sortingStrategy, Integer[] arr) {
        sortingStrategy.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
