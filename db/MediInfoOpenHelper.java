package com.example.fam_000.medicineinfo.db;

/**
 * Created by fam_000 on 2016/2/21.
 */
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

import java.lang.String;

public class MediInfoOpenHelper extends SQLiteOpenHelper{
    public static final String Create_Drug = "create table Drug ("
            + "id integer primary key autoincrement, "
            + "num integer, "
            + "name text, "
            + "price real, "
            + "img text, "
            + "content text)";
    public MediInfoOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(Create_Drug);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
