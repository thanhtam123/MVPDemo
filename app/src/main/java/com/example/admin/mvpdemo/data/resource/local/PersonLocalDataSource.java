package com.example.admin.mvpdemo.data.resource.local;

import com.example.admin.mvpdemo.data.model.Person;
import com.example.admin.mvpdemo.data.PersonDataSource;

import java.util.ArrayList;

/**
 * Created by TamTT on 7/27/2018.
 */

public class PersonLocalDataSource implements PersonDataSource {
    @Override
    public ArrayList<Person> getAllPeople() {
        ArrayList<Person> arrayPerson = new ArrayList<>();
        for(int i=0; i<20; i++){
            arrayPerson.add(new Person("Framgia"+i,"Hanoi"+i));
        }
        return arrayPerson;
    }
}
