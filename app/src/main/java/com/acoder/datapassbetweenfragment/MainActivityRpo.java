package com.acoder.datapassbetweenfragment;

public class MainActivityRpo {

    private static MainActivityRpo instance ;
    private String string;

    public static MainActivityRpo getInstance(){
        if(instance==null)
            instance = new MainActivityRpo();

        return instance;
    }

    public String getInitValue(){
        return "this is initial value";
    }

}
