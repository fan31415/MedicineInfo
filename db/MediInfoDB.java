package com.example.fam_000.medicineinfo.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

import com.example.fam_000.medicineinfo.model.Drug;
import java.lang.String;
import java.util.ArrayList;

/**
 * Created by fam_000 on 2016/2/21.
 */
public class MediInfoDB {
    public static final String DB_NAME = "MediInfo";
    public static final int VERSION = 1;
    private static MediInfoDB mediInfoDB;
    private SQLiteDatabase db;

    private MediInfoDB(Context contex){
        MediInfoOpenHelper dbHelper = new MediInfoOpenHelper(contex,DB_NAME,null,VERSION);
        db=dbHelper.getWritableDatabase();
    }

    public synchronized static MediInfoDB getInstance(Context context){
        if(mediInfoDB == null){
            mediInfoDB = new MediInfoDB(context);
        }
        return mediInfoDB;
    }

    public void saveDrugtoDb(Drug drug){
        if(drug!=null){
            ContentValues values = new ContentValues();
            values.put("num",drug.getNum());
            values.put("name",drug.getName());
            values.put("price",drug.getPrice());
            values.put("img",drug.getImg());
            values.put("content",drug.getMessage());
            db.insert("Drug",null,values);
        }
    }
    public Drug loadDrugFromDb(int num){
        Cursor cursor = db.query("Drug",null,"num = ?",new String[]{""+num},null,null,null);
        Drug drug=new drug();
        drug.setNum(cursor.getInt(cursor.getColumnIndex("num")));
        drug.setName(cursor.getString(cursor.getColumnIndex("name")));
        drug.setPrice(cursor.getFloat(cursor.getColumnIndex("price")));
        drug.setImg(cursor.getString(cursor.getColumnIndex("img")));
        drug.setMessage(cursor.getString(cursor.getColumnIndex("content")));
        if(cursor!=null){
            cursor.close();
        }
        return drug;
    }
}
