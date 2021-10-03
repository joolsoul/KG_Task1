package ru.vsu.kudinov_i_m.util;

import java.util.Arrays;

public class ArrayUtil
{

    public static int[] toIntArray(double[] arr)
    {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = (int) arr[i];
        }
        return newArr;
    }

    public static double[] multiplyArrayBy(double[] arr, int n)
    {
        return Arrays.stream(arr).map(e -> e * n).toArray();
    }
}