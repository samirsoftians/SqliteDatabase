package com.example.twtech.androidproject.login;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.twtech.androidproject.R;
import com.example.twtech.androidproject.androidabhi.Message;
import com.example.twtech.androidproject.database.MeHelper;
import com.example.twtech.androidproject.database.MyDatabase;
import com.example.twtech.androidproject.experiment.DBHelper;
import com.example.twtech.androidproject.experiment.SqliteOperatoins;
import com.example.twtech.androidproject.logs.MyLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Login  extends AppCompatActivity {

    TextView userName,UserPassword;
    Button Submit;
    MeHelper meHelper;
    Context context;

    DBHelper dbHelper;
    SqliteOperatoins sqliteOperatoins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        sqliteOperatoins=new SqliteOperatoins(this);


/*

//**********************Inserting data to sqlite*********************
        sqliteOperatoins.insertContact("Shivankchi","Shivankchi","shivankchisamir");
*/


        //***************Updating data on sqlite *******************
        long id = sqliteOperatoins.updateName("charli123","charli");
        if (id <= 0) {

            Log.e("Integer", String.valueOf(id));
            Message.message(getApplicationContext(), "Insertion Unsuccessful");

        } else {
            Log.e("Integer", String.valueOf(id));
            Message.message(getApplicationContext(), "Insertion Successful");

        }

      /*

      //*******************Deleting data from the sqlite **************
       int a = sqliteOperatoins.delete("ShivanchiMishra");
        if (a <= 0) {
            Message.message(getApplicationContext(), "Unsuccessful");

        } else {
            Message.message(this, "DELETED");

        }*/



/*

//*****************Retriving data from sqlite ******************
            String data = sqliteOperatoins.getData();
            Message.message(this, data);*/


       // database();

    }


/*

public void database()
{
    File f=new File("/data/data/com.example.twtech.androidproject/databases/sell");
    FileInputStream fis=null;
    FileOutputStream fos=null;

    try
    {
        fis=new FileInputStream(f);
        fos=new FileOutputStream("/mnt/sdcard/sell");
        while(true)
        {
            int i=fis.read();
            if(i!=-1)
            {fos.write(i);}
            else
            {break;}
        }
        fos.flush();
        Toast.makeText(this, "DB dump OK", Toast.LENGTH_LONG).show();
    }
    catch(Exception e)
    {
        e.printStackTrace();
        Toast.makeText(this, "DB dump ERROR", Toast.LENGTH_LONG).show();
    }
    finally
    {
       */
/* try
        {
            fos.close();
            fis.close();
        }
        catch(IOException ioe)
        {}*//*

    }
}
*/


}
