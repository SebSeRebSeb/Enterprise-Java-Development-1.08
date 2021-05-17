### Review of Lab 1.08 (Tim Acosta):

* Aufgabe 1 - Big Decimal - Die Aufgabe sah voraus dass BigDecimal benutzt wird, mit den verschiedenen Methoden wie setScale(). Trotzdem guter Ansatz mit Math!
* Aufgabe 2 - Car inventory system - Perfekt!
* Aufgabe 3 - TV Series and Movie - Perfekt!
* Aufgabe 4 - Es ensteht eine IndexOutOfBoundsException weil die add() Methode in IntArrayList nie in den for kommt weil die Länge deines ArrayList immer 0 ist.
Die minCapacity ist nicht die size eines ArraysList:

*What is the difference between ArrayList size and ArrayList capacity?*
* ArrayList capacity is the maximum number of elements it can hold without resizing the internal array.
* The size of ArrayList is the number of elements it currently has

Da lenght immer 0 ist und du die length in der add Methode nutzt, wird was in der for Schleife gemacht werden soll, nie ausgeführt.
Wenn die Aufgabe eine fixed size erwartet, würde Ich direkt mit arrays arbeiten, und nicht mit Listen.

"Array is a fixed size data structure while ArrayList is not. One need not to mention the size of Arraylist while creating its object.
Even if we specify some initial capacity, we can add more elements."

 ```java
 //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0

 //Alternative

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


 ```



