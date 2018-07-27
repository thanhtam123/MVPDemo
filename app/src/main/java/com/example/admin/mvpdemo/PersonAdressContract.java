package com.example.admin.mvpdemo;

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
