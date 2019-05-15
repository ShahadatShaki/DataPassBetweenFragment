package com.acoder.datapassbetweenfragment;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainActivityVM extends ViewModel {

    MutableLiveData<String> string = new MutableLiveData<>();
    MainActivityRpo mainActivityRpo = new MainActivityRpo();


    public  LiveData<String> getString(){
        return string;
    }

    public void setString(String string){
        this.string.postValue(string);
    }

    public void setInitValue(){
        string.postValue(mainActivityRpo.getInitValue());
    }


}
