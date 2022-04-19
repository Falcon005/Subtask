package java.uz.epam.findingprime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingPrimeNumbersInArray {
    public void findingPrimeNumbersInArray(int[] array){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            boolean isPrime=true;
            int number=array[i];
            for (int j = 2; j <= (int)Math.sqrt(number); j++) {
                if(number==2){
                    list.add(number);
                }
                if(number%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                list.add(number);
            }
        }
        System.out.println(list);
    }
}
