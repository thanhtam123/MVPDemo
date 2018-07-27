package com.example.admin.mvpdemo.screen.main;

import com.example.admin.mvpdemo.data.model.Person;

import java.util.ArrayList;

/**
 * Created by TamTT on 7/27/2018.
 */

public interface PersonAdressContract {
    interface View{
        void showListSuccess(ArrayList<Person> arr);
        void showListFail();
    }
    interface Presenter{
        void loadListPerson();
        
    }

}
