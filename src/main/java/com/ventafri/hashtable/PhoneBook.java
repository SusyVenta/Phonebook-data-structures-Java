package com.ventafri.hashtable;
import java.util.Arrays;

public class PhoneBook {
    /* Initial capacity set to 16 as in Java HashMap */
    private static int initialSize = 16;
    private static int currentSize = 16;
    /* Initialize bucket array containing keys*/
    private static int[] keyArray = new int [16];
    Arrays.fill(keyArray, null);
    /* Initialize bucket array containing values*/
    private static List<String> valueArray = new ArrayList<>();
    /* load factor set to 2/3 of the storing capacity as in Java and Python */
    private static int loadFactor = 0.75;
    private static int numberOfContacts = 0;

    private static float calculateLoadFactor(){
        return numberOfContacts / currentSize;
    }

    private static void checkIfResizeNeeded(){
        if (this.calculateLoadFactor() >= loadFactor){
            keyArray

        }
    }
}
