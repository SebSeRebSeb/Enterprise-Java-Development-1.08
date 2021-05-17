package IntListTask;


import java.util.ArrayList;
import java.util.Arrays;

public class IntArrayList implements IntList {
    private Integer[] array = new Integer[10];


    @Override
    public void add(int val) {
        boolean hasBeenAdded = false;
        for (int i=0; i<array.length; i++) {
            // Validate if has an empty position in the array
            if (array[i] == null) {
                array[i] = val;
                hasBeenAdded = true;
                break;
            }
        }

        // Validate if the item has been added
        if (!hasBeenAdded) {
            System.out.println("Update size " + array.length);

            // Calculate new length
            int newLength = array.length + array.length/2;

            // Create new array
            Integer[] newArray = new Integer[newLength];

            // Fill new array with old array values
            for (int i=0; i<array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[array.length] = val;

            // Override the array with newArray
            array = newArray;
        }
    }

    public int getSize() {
        return array.length;
    }

    @Override
    public int get(int id) {
        return array[id];
    }
}
