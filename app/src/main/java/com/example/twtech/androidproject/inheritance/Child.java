package com.example.twtech.androidproject.inheritance;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Child extends Parent
{
    int value = 10;
    Context context;
    Child()
    {

        Log.e("Child class","Child class called");

/*
        Toast.makeText(context, "Child class", Toast.LENGTH_LONG).show();
*/
    }

}
