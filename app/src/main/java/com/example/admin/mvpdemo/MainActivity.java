package com.example.admin.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PersonAdressContract.View{

    private RecyclerView rvPeople;
    private RecyclerViewAdapter mRcvAdapter;
    private TextView txt;

    private PeopleAddressPresenter peopleAddressPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peopleAddressPresenter = new PeopleAddressPresenter(this);
        peopleAddressPresenter.loadListPerson();
    }

    @Override
    public void showListSuccess(ArrayList<Person> arr) {
        rvPeople = findViewById(R.id.rv);
        mRcvAdapter = new RecyclerViewAdapter(arr);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        rvPeople.setLayoutManager(layoutManager);
        rvPeople.setAdapter(mRcvAdapter);
    }

    @Override
    public void showListFail() {
        rvPeople = findViewById(R.id.rv);
        txt = findViewById(R.id.textview);

        rvPeople.setVisibility(View.GONE);
        txt.setVisibility(View.VISIBLE);
    }


}
