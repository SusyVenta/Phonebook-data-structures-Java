package com.ventafri.hashtable;

import com.ventafri.Common.Address;
import com.ventafri.Common.Email;
import com.ventafri.Common.Phone;
import GoogleGuava.xml; /** how to import libraries?? **/

public class Contact {
    private static String firstName = "";
    private static String surname = "";
    private static Phone phone = new Phone();
    private static Address address = new Address();
    private static Email email = new Email();

    private Contact (String inputName, String inputSurname){
        if (!(inputSurname.isEmpty() || inputSurname == "")){
            surname = inputSurname;
        }
        firstName = inputName;
    }

    public String getAllContactDetails(){
        StringBuilder contactInfo = new StringBuilder();
        contactInfo.append(firstName).append(" ").append(surname).append(":\n").append(phone.getAllPhones()).append(
        address.getAllAddresses()).append(email.getEmails()).toString();
        return contactInfo;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSurname(){
        return surname;
    }

    public String getNameAndSurname(){
        if(!(surname.isEmpty() || surname == "")){
            return firstName + " " + surname;
        } else{
            return firstName;
        }
    }

    public void setSurname(String inputSurname){
        surname = inputSurname;
    }

    public void setFirstName(String inputName){
        firstName = inputName;
    }

}
