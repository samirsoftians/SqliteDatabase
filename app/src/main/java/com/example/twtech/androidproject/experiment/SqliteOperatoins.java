package com.example.twtech.androidproject.experiment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.twtech.androidproject.androidabhi.myDbAdapter;

import static com.example.twtech.androidproject.experiment.DBHelper.COL_IMEI;
import static com.example.twtech.androidproject.experiment.DBHelper.COL_PASSWORD;
import static com.example.twtech.androidproject.experiment.DBHelper.COL_USER_NAME;
import static com.example.twtech.androidproject.experiment.DBHelper.TABLE_NAME;

public class SqliteOperatoins {

    DBHelper dbHelper;
    Context context;


    public SqliteOperatoins(Context context)
    {
        dbHelper=new DBHelper(context);
    }


    public boolean insertContact (String username, String password, String imei) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_USER_NAME, username);
        contentValues.put(COL_PASSWORD, password);
        contentValues.put(COL_IMEI, imei);

        db.insert(TABLE_NAME, null, contentValues);
        Log.e("DataInserted", "True");
        return true;
    }


    public int updateName(String oldName , String newName)
    {

        int count=1;
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(dbHelper.COL_USER_NAME,newName);
        String[] whereArgs= {oldName};
        String updat="UPDATE tab_login SET imei='Hi Shivankchi' WHERE user_name='Shivankchi' and imei ='shivankchisamir'";
        db.execSQL(updat);

        //int count =db.update(dbHelper.TABLE_NAME,contentValues, dbHelper.COL_USER_NAME+" = ?",whereArgs );
        return count;
    }

    public  int delete(String uname)
    {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String[] whereArgs ={uname};

        int count =db.delete(dbHelper.TABLE_NAME , dbHelper.COL_USER_NAME+" = ?",whereArgs);
        return  count;
    }

    public String getData()
    {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String[] columns = {dbHelper.UID, dbHelper.COL_USER_NAME, dbHelper.COL_PASSWORD,dbHelper.COL_IMEI};
        Cursor cursor =db.query(dbHelper.TABLE_NAME,columns,null,null,null,null,null);
        StringBuffer buffer= new StringBuffer();
        while (cursor.moveToNext())
        {
            int cid =cursor.getInt(cursor.getColumnIndex(dbHelper.UID));
            String name =cursor.getString(cursor.getColumnIndex(dbHelper.COL_USER_NAME));
            String  password =cursor.getString(cursor.getColumnIndex(dbHelper.COL_PASSWORD));
            String  imei =cursor.getString(cursor.getColumnIndex(dbHelper.COL_IMEI));
            buffer.append(cid+ "   " + name + "   " + password +" "+ imei +" \n");
        }
        return buffer.toString();
    }

}
