package com.example.admin.mvpdemo.data;

import com.example.admin.mvpdemo.data.model.Person;
import com.example.admin.mvpdemo.data.resource.local.PersonLocalDataSource;

import java.util.ArrayList;

/**
 * Created by TamTT on 7/27/2018.
 */

public class PersonRepository implements PersonDataSource{
    private PersonDataSource personDataSource;
    /*
    * Thao tác chung với local & remote réource
    * */

    @Override
    public ArrayList<Person> getAllPeople() {
        personDataSource = new PersonLocalDataSource();
        return personDataSource.getAllPeople();
    }
}
