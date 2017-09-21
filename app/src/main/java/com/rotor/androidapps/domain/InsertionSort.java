package com.rotor.androidapps.domain;

/**
 * Created by jatempa on 9/20/17.
 */

public class InsertionSort implements SortMethods {

    @Override
    public int[] sort(int[] numbers) {
        int temp;

        for (int i = 1; i < numbers.length; i++) {
            for(int j = i; j > 0 ; j--){
                if(numbers[j] < numbers[j-1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;
                }
            }
        }

        return numbers;
    }
}
