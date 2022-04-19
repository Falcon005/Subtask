package java.uz.epam.subtask;

import java.util.Arrays;

public class CustomArray {
    int[] array;

    //empty constructor
    public CustomArray(){}

    //constructor that sets array
    public CustomArray(int[] array){
        this.array = array;
    }

    //in this method we set array
    public void setArray(int[] array) {
        this.array = array;
    }

    //in this method we get array
    public int[] getArray() {
        return array;
    }

    //overridden equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(array, that.array);
    }
    //overridden hashcode method
    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    //overridden toString method
    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
