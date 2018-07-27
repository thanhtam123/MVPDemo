package com.example.admin.mvpdemo.screen.main;

import com.example.admin.mvpdemo.data.PersonRepository;
import com.example.admin.mvpdemo.data.model.Person;

import java.util.ArrayList;

/**
 * Created by TamTT on 7/27/2018.
 */

public class PeopleAddressPresenter implements PersonAdressContract.Presenter {

    private PersonRepository personRepository;
    private PersonAdressContract.View view;

    public PeopleAddressPresenter(PersonAdressContract.View view) {
        this.view = view;
    }

    @Override
    public void loadListPerson() {
        ArrayList<Person> arrayList;
        personRepository = new PersonRepository();
        arrayList = personRepository.getAllPeople();
        if (arrayList.size() > 0){
            view.showListSuccess(arrayList);
        }else {
            view.showListFail();
        }
    }

}
