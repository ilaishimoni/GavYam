package com.example.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class HelperDB  extends SQLiteOpenHelper {

    String strCreate, strDelete;
    SQLiteDatabase db;



    private static final String DATABASE_NAME = "dbexam.db";
    private static final int DATABASE_VERSION = 1;

    public HelperDB(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        strCreate="CREATE TABLE "+workers_table.CARD_ID;
        strCreate+=" "+workers_table.FINAL_NAME+" TEXT,";
        strCreate+=" "+workers_table.NAME+" TEXT,";
        strCreate+=" "+workers_table.COMPANY+" TEXT,";
        strCreate+=" "+workers_table.WORKER_ID+" INTEGER";
        strCreate+=" "+workers_table.PHONE_NUMBER+" INTEGER";
        strCreate+=" ("+workers_table.KEY_ID+" INTEGER PRIMARY KEY,";
        strCreate+=");";
        db.execSQL(strCreate);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        strDelete="DROP TABLE IF EXISTS "+workers_table.CARD_ID;
        db.execSQL(strDelete);

        onCreate(db);
    }
}
