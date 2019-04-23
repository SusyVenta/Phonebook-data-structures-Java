package com.ventafri.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {
    // initialize variables
    private String phoneType = "";
    private String phoneNumber = "";
    // I want to do this: self.phones = {"Mobile": [], "Home": [], "Work": []}
    // Difference Map vs HashMap?
    private ArrayList<String> mobilePhones = new ArrayList<String>();
    private ArrayList<String> homePhones = new ArrayList<String>();
    private ArrayList<String> workPhones = new ArrayList<String>();
    // str.add("Geeks");
    private Map<String, List<String>> phones = new HashMap<String, List<String>>();

    //constructor
    Phone (String phoneType){

    }
}
