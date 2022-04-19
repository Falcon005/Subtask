package java.uz.epam.maxandmin;

public class MaxAndMin {
    public void maxAndMin(int[] array){
        int max=array[0];
        int min=array[0];

        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Max: "+max+" Min: "+min);
    }
}
