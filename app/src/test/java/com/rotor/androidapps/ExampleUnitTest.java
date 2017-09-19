package com.rotor.androidapps;

import com.rotor.androidapps.domain.BubbleSort;
import com.rotor.androidapps.domain.SortMethods;

import junit.framework.Assert;

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
public class ExampleUnitTest {
    @Test
    public void testSortMethodsInterface()  {
        SortMethods example = mock(SortMethods.class);
        int[] arrayDemo = { 3,52,12,94,83 };
        int[] arraySorted = { 3,12,52,83,94 };
        when(example.sort(arrayDemo)).thenReturn(arraySorted);
        Assert.assertEquals(arraySorted, example.sort(arrayDemo));
    }

    @Test
    public void testBubbleSortMethod()  {
        SortMethods example = new BubbleSort();
        int[] arrayDemo = { 3,52,12,94,83 };
        int[] result = example.sort(arrayDemo);
        Assert.assertTrue(94 == result[4]);
    }

    @Test
    public void testMergeSortMethod()  {
        /* implementation */
    }

    @Test
    public void testQuickSortMethod()  {
        /* implementation */
    }
}