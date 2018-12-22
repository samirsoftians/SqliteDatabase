package com.example.twtech.androidproject.inheritance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.twtech.androidproject.R;
import com.example.twtech.androidproject.experiment.SqliteOperatoins;

public class Test extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);



        Child obj=new Child();

        Log.e("obj.value", String.valueOf(obj.value));



        Parent par = obj;




        Log.e("par.value", String.valueOf(par.value));



    }
}


