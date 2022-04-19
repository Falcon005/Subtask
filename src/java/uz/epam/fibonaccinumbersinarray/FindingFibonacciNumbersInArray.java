package java.uz.epam.fibonaccinumbersinarray;

public class FindingFibonacciNumbersInArray {
    public  boolean isPerfectSquare(int num){
        int n=(int)Math.sqrt(num);
        return (n*n==num);
    }
    //n is length of array
    public void findingFibonacciNumbersInArray(int array[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(isPerfectSquare(5*array[i]*array[i]+4) || isPerfectSquare(5*array[i]*array[i]-4)){
                System.out.print(array[i]+" ");
                count++;
            }
        }
        if(count==0){
            System.out.println("No present");
        }
    }
}
