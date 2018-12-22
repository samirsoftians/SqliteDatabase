package com.example.twtech.androidproject.database;

import android.util.Log;

import com.example.twtech.androidproject.logs.MyLogger;

public class MyDatabase {

    public static final String DB_NAME = "sell";
    public static final Integer DB_VERSION = 2;

    public static final String TABLE_NAME = "tab_login";
    public static final String COL_USER_NAME = "user_name";
    public static final String COL_PASSWORD = "password";
    public static final String UID = "userid";
    public static final String COL_IMEI = "imei";

    private static final String CREATE_TABLE2 = "CREATE TABLE "+TABLE_NAME+
            " ("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COL_USER_NAME+" VARCHAR(255) ,"+ COL_PASSWORD+" VARCHAR(225),"+  COL_IMEI+" VARCHAR(225));";
    private static final String DROP_TABLE2 ="DROP TABLE IF EXISTS "+TABLE_NAME;

    public static class MeTableLogin {








        public static String createTable() {

            Log.e("Table","TableCreated");

            new MyLogger().storeMessage("MyDatabase-createTable()", "creating the table");

            StringBuilder query = new StringBuilder();
            query.append("CREATE TABLE " + TABLE_NAME + "(");
            query.append(COL_USER_NAME + " " + "text" + ",");
            query.append(COL_PASSWORD + " " + "text" + ",");

            query.append(COL_IMEI + " " + "integer DEFAULT 1");
            query.append(" )");
            Log.i("@Transworld", "Query Create Table - " + query.toString());
            return query.toString();
        }
    }

}
