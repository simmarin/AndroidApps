package com.rotor.androidapps.domain;

/**
 * Created by jatempa on 9/14/17.
 */

public class BubbleSort implements SortMethods {

    @Override
    public int[] sort(int[] numbers) {
        int n = numbers.length;
        int c, d, swap;

        for (c = 0; c < ( n - 1 ); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (numbers[d] > numbers[d+1]) { /* For descending order use < */
                    swap = numbers[d];
                    numbers[d] = numbers[d+1];
                    numbers[d+1] = swap;
                }
            }
        }

        return numbers;
    }
}
