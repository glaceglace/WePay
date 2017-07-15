package com.example.android.wepay;

/**
 * Created by jingyuan on 15/07/17.
 */

public class ClientInfo {
    private String restaurantName;
    private String eMail;
    private int Uid;

    public int getUid(){
        return Uid;
    }
    public String getRestaurantName(){
        return restaurantName;
    }
    public String geteMail(){
        return eMail;
    }
    public void setUid(int id){
        Uid = id;
    }
    public void setRestaurantName(String name){
        restaurantName = name;
    }
    public void seteMail(String name){
        eMail = name;
    }
}
