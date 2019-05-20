package com.ventafri.hashtable;

import com.ventafri.Common.Address;
import com.ventafri.Common.Email;
import com.ventafri.Common.Phone;

public class Contact {
    private static String firstName = "";
    private static String surname = "";
    private static Phone phone;
    private static Address address;
    private static Email emailAddress;

    private Contact (String inputName, String inputSurname){
        this.firstName = inputName;
        this.surname = inputSurname;
        this.address = new Address();
        this.emailAddress = new Email();
    }

    public String getAllContactDetails (){
        StringBuilder contactInfo = new StringBuilder();
        contactInfo.append(firstName).append(surname).append(Phone.getAllPhones()).append(Address.getAllAddresses
        ).append(Email.getAllEmailAddresses).toString();
        return contactInfo;
    }

    public String getName(){
        return firstName;
    }

    public String getSurname(){
        return surname;
    }

    public String getNameAndSurname(){
        if (surname == ""){
            return firstName;
        }
        return firstName + " " + surname;
    }

    public void setSurname(String inputSurname){
        surname = inputSurname;
    }

    public void setName(String inputName){
         firstName = inputName;
    }
}
