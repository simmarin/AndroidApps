package com.rotor.androidapps.domain;

/**
 * Created by jatempa on 9/20/17.
 */

public class SelectionSort implements SortMethods {

    @Override
    public int[] sort(int[] numbers) {
        for (int i = 0; i < (numbers.length - 1); i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[j] < numbers[index])
                    index = j;

            int smallerNumber = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = smallerNumber;
        }

        return numbers;
    }
}
