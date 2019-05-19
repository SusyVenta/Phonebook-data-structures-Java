package com.ventafri.Common;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private static List<String> emailAddresses = new ArrayList<>();

    public String getEmails(){
        StringBuilder emails = new StringBuilder();
        if(emailAddresses.size() > 0){
            emails.append("E-mail addresses: \n").append(String.join("\n", emailAddresses));
            return emails.toString();
        } else{
            return "";
        }
    }

    public String getEmail(int emailIndex){
        return emailAddresses.get(emailIndex);
    }

    public void addEmail (String email){
        emailAddresses.add(email);
    }

    public void modifyEmail(int emailIndex, String email){
        emailAddresses.set(emailIndex, email);
    }
}
