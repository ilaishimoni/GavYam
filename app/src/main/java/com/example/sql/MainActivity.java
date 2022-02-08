package com.example.sql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent si;
    SQLiteDatabase db;
    HelperDB hlp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        hlp = new HelperDB(this);
        db = hlp.getWritableDatabase();
        db.close();


        setContentView(R.layout.activity_main);
    }

    public void workers(View view) {
        si = new Intent(this,workers.class);
        startActivity(si);

    }

    public void companies(View view) {
        si = new Intent(this,companies.class);
        startActivity(si);
    }

    public void meals(View view) {
        si = new Intent(this,meals.class);
        startActivity(si);
    }

    public void orders(View view) {
        si = new Intent(this,orders.class);
        startActivity(si);
    }

    public void exit(View view) {
        finish();
    }
}