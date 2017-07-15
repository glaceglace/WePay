package com.example.android.wepay;

import java.util.Date;

/**
 * Created by jingyuan on 15/07/17.
 */

public class Receipt {
    private boolean isAliPay;
    private Date date;
    private double price;
    private int Uid;

    public boolean getIsAliPay(){
        return isAliPay;
    }
    public Date getDate(){
        return date;
    }
    public double getPrice(){
        return price;
    }
    public int getUid(){
        return Uid;
    }
    public void setIsAliPay(boolean isAli){
        isAliPay = isAli;
    }
    public void setDate(Date payDay){
        date = payDay;
    }
    public void setPrice(double montant){
        price = montant;
    }
    public void setUid(int id){
        Uid = id;
    }
}
