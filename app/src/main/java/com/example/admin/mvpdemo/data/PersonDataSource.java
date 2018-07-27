package com.example.admin.mvpdemo.data;

import com.example.admin.mvpdemo.data.model.Person;

import java.util.ArrayList;

/**
 * Created by TamTT on 7/27/2018.
 */

public interface PersonDataSource {
    ArrayList<Person> getAllPeople();
}
