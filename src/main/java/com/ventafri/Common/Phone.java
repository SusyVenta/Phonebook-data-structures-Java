package com.ventafri.Common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {
    // initialize variables
    String phoneType;
    String phoneNumber;
    private static Map<String, List<String>> phones = new HashMap<String, List<String>>();
    // I want to do this: self.phones = {"Mobile": [], "Home": [], "Work": []}
    private static List<String> mobilePhones = new ArrayList<>();
    private static List<String> homePhones = new ArrayList<>();
    private static List<String> workPhones = new ArrayList<>();


    //constructor
    // public or private??
    // constructor or main? is main mandatory?
    private Phone (String inputPhoneType, String inputPhoneNumber){
        phoneType = "Mobile";
        phoneType = inputPhoneType;
        phoneNumber = "";
        phoneNumber = inputPhoneNumber;
        phones.put("Mobile", mobilePhones);
        phones.put("Home", homePhones);
        phones.put("Work", workPhones);
    }

    public List<String> getPhone (String phoneType){
        return phones.get(phoneType);
    }

    public StringBuilder getAllPhones () {
        StringBuilder allPhones = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : phones.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            if (values.size() >= 1) {
                allPhones.append(key).append(": ").append(values);
            }
        }
        return allPhones;
    }

    public void addPhone (String phoneType, String phoneNumber){
        List listToModify = phones.get(phoneType);
        listToModify.add(phoneNumber);
    }

    public void modifyPhone (String phoneType, String phoneNumber, int phoneIndex){
        List listToModify = phones.get(phoneType);
        listToModify.set(phoneIndex, phoneNumber);
    }
}











