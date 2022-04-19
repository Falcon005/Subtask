package main;

import java.util.Arrays;
import java.uz.epam.subtask.CustomArray;
import java.uz.epam.fibonaccinumbersinarray.FindingFibonacciNumbersInArray;
import java.uz.epam.binarysearch.BinarySearch;
import java.uz.epam.findingprime.FindingPrimeNumbersInArray;
import java.uz.epam.maxandmin.MaxAndMin;
import java.uz.epam.sorting.SortingTheArrayInThreeWays;
import java.uz.epam.datareader.txtfile.DataReader;
import java.uz.epam.fillingwithrandom.FillingWithRandom;

public class Main {
    public static void main(String[] args) {
        int[] array={1,5,6,8,11,3,54,67,87,19,50};

        CustomArray ca = new CustomArray();
        ca.setArray(array);

        FindingFibonacciNumbersInArray ffn = new FindingFibonacciNumbersInArray();
        ffn.findingFibonacciNumbersInArray(array,array.length);

        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(array,5));

        FindingPrimeNumbersInArray fa = new FindingPrimeNumbersInArray();
        fa.findingPrimeNumbersInArray(array);

        MaxAndMin mam = new MaxAndMin();
        mam.maxAndMin(array);

        SortingTheArrayInThreeWays ss = new SortingTheArrayInThreeWays();
        ss.bubleSort(array);
        ss.insertionSort(array);
        ss.shuttleSort(array);

        DataReader dr = new DataReader();
        dr.readFromFile();

        FillingWithRandom fw = new FillingWithRandom();
        int[] array2 = fw.fillingWithRandom();
        System.out.println(Arrays.toString(array2));


    }
}
