package com.rotor.androidapps;

import com.rotor.androidapps.domain.BubbleSort;
import com.rotor.androidapps.domain.InsertionSort;
import com.rotor.androidapps.domain.MergeSort;
import com.rotor.androidapps.domain.QuickSort;
import com.rotor.androidapps.domain.SelectionSort;
import com.rotor.androidapps.domain.SortMethods;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SortMethodsUnitTest {
    SortMethods method = null;
    int[] inputValues, outputValues;

    @Before
    public void setup() {
        inputValues = new int[]{3, 52, 12, 94, 83};
    }

    @Test
    public void testSortMethodsInterface() {
        method = mock(SortMethods.class);
        outputValues = new int[]{ 3,12,52,83,94 };
        when(method.sort(inputValues)).thenReturn(outputValues);
        Assert.assertTrue(94 == outputValues[4]);
    }

    @Test
    public void testBubbleSortMethod() {
        method = new BubbleSort();
        outputValues = method.sort(inputValues);
        Assert.assertTrue(94 == outputValues[4]);
    }

    @Test
    public void testMergeSortMethod() {
        method = new MergeSort();
        outputValues = method.sort(inputValues);
        Assert.assertTrue(94 == outputValues[4]);
    }

    @Test
    public void testQuickSortMethod() {
        method = new QuickSort();
        outputValues = method.sort(inputValues);
        Assert.assertTrue(94 == outputValues[4]);
    }

    @Test
    public void testInsertionSortMethod() {
        method = new InsertionSort();
        outputValues = method.sort(inputValues);
        Assert.assertTrue(94 == outputValues[4]);
    }

    @Test
    public void testSelectionSortMethod() {
        method = new SelectionSort();
        outputValues = method.sort(inputValues);
        Assert.assertTrue(94 == outputValues[4]);
    }
}