package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {
    //Fiels Injection

    //@Autowired
    //OfficeHours officeHours;

    //Constructor injection
    OfficeHours officeHours;

//    @Autowired
//    public void getTeachingHours(OfficeHours officeHours){
//        this.officeHours = officeHours;

        public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));

    }
}
