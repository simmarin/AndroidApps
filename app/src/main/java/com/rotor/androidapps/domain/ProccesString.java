package com.rotor.androidapps.domain;
/**
 * Created by SMMH on 21/09/2017.
 */

public class ProccesString {


    public Integer[] proccesString(String arrayString){

        String line =arrayString;
        String[] numberStrs = line.split(",");
        Integer[] numbers = new Integer[numberStrs.length];
        for(int i = 0;i < numberStrs.length;i++)
        {
            try
            {
                numbers[i] = Integer.parseInt(numberStrs[i]);
            }
            catch (NumberFormatException nfe)
            {
                numbers[i] = null;
            }
        }
        return numbers;
}
}