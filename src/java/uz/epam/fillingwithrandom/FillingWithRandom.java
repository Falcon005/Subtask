package java.uz.epam.fillingwithrandom;

import java.util.Random;

public class FillingWithRandom {
    int[] array=new int[20];
    public int[] fillingWithRandom(){
        Random rand = new Random(47);
        for(int i=0;i<20;i++){
            array[i]= rand.nextInt(100);
        }
        return array;
    }

}
