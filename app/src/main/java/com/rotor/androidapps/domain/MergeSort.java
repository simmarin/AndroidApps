package com.rotor.androidapps.domain;

/**
 * Created by Edgar_Rangel on 9/19/2017.
 */

public class MergeSort implements SortMethods {
    private int[] array;
    private int[] tempMergArr;
    private int lenght;

    public int[] sort(int[] numbers){
        this.array = numbers;
        this.lenght = numbers.length;
        this.tempMergArr =  new int[lenght];
        doMergeSort(0, lenght - 1);
        return numbers;
    }

    private void doMergeSort(int lowerIndex, int higherIndex){
        if(lowerIndex < higherIndex){
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            doMergeSort(lowerIndex, middle);

            doMergeSort(middle + 1, higherIndex);

            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex){
        for (int i = lowerIndex; i <= higherIndex; i++){
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while(i <= middle && j <= higherIndex){
            if(tempMergArr[i] <= tempMergArr[j]){
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
        }
        while (i <= middle){
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
}
