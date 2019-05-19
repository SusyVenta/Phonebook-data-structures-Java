package com.ventafri.Common;

import java.util.HashMap;
import java.util.Map;

public class Address {
    public static Map<String, String> addresses = new HashMap<String, String>();

    public String getAddress(String inputAddressType){
        return addresses.get(inputAddressType);
    }

    public String getAllAddresses(){
        StringBuilder allAddresses = new StringBuilder();
        for (Map.Entry<String, String> entry : addresses.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                allAddresses.append(key).append(": ").append(value).append("\n");
            }
        }
        return allAddresses.toString();
    }

    public void addAddress(String inputAddress, String addressType){
        addresses.put(addressType, inputAddress);
    }

    public void modifyAddress(String addressType, String newAddress){
        addresses.replace(addressType, newAddress);
    }
}
