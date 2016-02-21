package com.example.fam_000.medicineinfo.model;

import java.util.PriorityQueue;

/**
 * Created by fam_000 on 2016/2/21.
 */
public class  Drug  {
    private int num;
    private String name;
    private String img;
    private String message;//content
    private int count;
    private int fcount;
    private String keywords;
    private String description;
    private float price;
    private String tag;
    private String type;

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String  getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public String getImg(){
        return img;
    }
    public void setImg(String img){
        this.img=img;
    }
    public float getPrice(){
        return  price;
    }
    public vod setPrice(float price){
        this.price=price;
    }
}
