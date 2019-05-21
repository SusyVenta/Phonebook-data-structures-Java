package com.ventafri.hashtable;
import java.util.Arrays;
import java.utils.Arrays.copyOf;

public class PhoneBook {
    /* Initial capacity set to 16 as in Java HashMap */
    private static int initialSize = 16;
    private static int currentSize = 16;
    private static int skipValue = 1;
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
            newSize = currentSize + initialSize;
            keyArray = copyOf(keyArray, newSize)
            Arrays.fill(keyArray, currentSize, newSize+1, null);
            valueArray = copyOf(valueArray, newSize);
            Arrays.fill(valueArray, currentSize, newSize+1, null);
            currentSize += initialSize;
        }
    }

    private static float hashFunction(Object inputKey){
        objectHash = hashCode(inputKey) % currentSize;
        return objectHash;
    }

    private static boolean isCollision(Float hashValue, Object inputKey){
        return keyArray[hashValue] != null && keyArray[hashValue] != inputKey;
    }

    private static boolean isBucketEmpty(Float hashValue){
        return keyArray[hashValue] == null;
    }

    private static void writeKeyAndData(Float hashValue, Object key, Object data){
        keyArray[hashValue] = key;
        valueArray[hashValue] = data;
    }

    private static boolean ifEmptyBucketWriteKeyAndData(Float hashValue, Object key, Object data){
        if(isBucketEmpty(hashValue)){
            writeKeyAndData(hashValue, key, data);
            return true;
        } return false;
    }

    private static boolean replaceDataIfKeyIsTheSame(Float hashValue, Object key, Object data){
        if(keyArray[hashValue] == key){
            valueArray[hashValue] = data;
            return true;
        } return false;
    }

    private static boolean findKey(Float hashValue, Object key){
        if(keyArray[hashValue] == key){
            return true;
        } return false;
    }

    private static float rehash(float oldHash, skipvalue){
        float newHash = (oldHash + skipvalue) % currentSize;
        return newHash;
    }

    private static int rehashUntilNoCollisionFound(Float hashValue, Object key, Object Value, int skipValue){
        Float nextSlot = rehash(hashValue, skipValue);
        if (nextSlot)
    }

}














