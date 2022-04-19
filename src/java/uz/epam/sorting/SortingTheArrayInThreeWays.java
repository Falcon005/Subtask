package java.uz.epam.sorting;

import java.util.Arrays;

public class SortingTheArrayInThreeWays {
    //Bubble Sort
    private void swap(int[] array,int ind1,int ind2){
        int tmp=array[ind1];
        array[ind1]=array[ind2];
        array[ind2]=tmp;
    }
    public void bubleSort(int[] array){
        System.out.println(Arrays.toString(array));
        boolean needIteration=true;
        while(needIteration){
            needIteration=false;
            for(int i=1;i<array.length;i++){
                if(array[i]<array[i-1]){
                    swap(array,i,i-1);
                    needIteration=true;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

    //Insertion Sort
    public void insertionSort(int[] array){
        System.out.println(Arrays.toString(array));
        for(int left=0;left<array.length;left++){
            int value=array[left];
            int i=left-1;
            for(;i>=0;i--){
                if(value<array[i]){
                    array[i+1]=array[i];
                }else{
                    break;
                }
            }
            array[i+1]=value;
        }
        System.out.println(Arrays.toString(array));
    }

    //ShuttleSort
    public void shuttleSort(int[] array){
        System.out.println(Arrays.toString(array));
        for(int i=1;i< array.length;i++){
            if(array[i]<array[i-1]){
                swap(array,i,i-1);
                for(int z=i-1;(z-1)>=0;z--){
                    if(array[z]<array[z-1]){
                        swap(array,z,z-1);
                    }else{
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
