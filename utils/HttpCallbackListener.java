package com.example.fam_000.medicineinfo.utils;

/**
 * Created by fam_000 on 2016/2/21.
 */
public interface HttpCallbackListener{
    void onFinish(String    response);
    void onError(Exception e);
}
