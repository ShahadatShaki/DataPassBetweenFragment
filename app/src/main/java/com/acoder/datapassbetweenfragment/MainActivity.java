package com.acoder.datapassbetweenfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DataPass {

    Fragemnt2 fragemnt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragemnt2 = new Fragemnt2();

        fragemnt1();
        fragemnt2(fragemnt2);



    }

    private void fragemnt1(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragemnt1, new Fragment1()).commitAllowingStateLoss();
    }

    private void fragemnt2(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragemnt2, fragment).commitAllowingStateLoss();
    }

    @Override
    public void data(String s) {
//        Toast.makeText(this, ""+s, Toast.LENGTH_LONG).show();


        fragemnt2.data(s);
    }
}
