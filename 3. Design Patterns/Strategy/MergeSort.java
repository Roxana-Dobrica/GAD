package DesignPatterns.Strategy;

import java.util.Arrays;

class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        if (list.length > 1) {
            int mid = list.length / 2;
            Integer[] left = Arrays.copyOfRange(list, 0, mid);
            Integer[] right = Arrays.copyOfRange(list, mid, list.length);

            sort(left);
            sort(right);

            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    list[k] = left[i];
                    i++;
                } else {
                    list[k] = right[j];
                    j++;
                }
                k++;
            }

            while (i < left.length) {
                list[k] = left[i];
                i++;
                k++;
            }

            while (j < right.length) {
                list[k] = right[j];
                j++;
                k++;
            }
        }
    }
}

