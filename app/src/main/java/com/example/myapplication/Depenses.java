package com.example.myapplication;


import java.util.Date;

public class Depenses {
    private final int amount;
    private final Date date;
    private final String title;

    public Depenses(int amount, Date date,String title){
        this.amount=amount;
        this.date=date;
        this.title=title;
    }

    public Date getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public String getTitle() {
        return title;
    }
}
