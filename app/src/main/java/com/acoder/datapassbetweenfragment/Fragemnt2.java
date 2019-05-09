package com.acoder.datapassbetweenfragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.acoder.datapassbetweenfragment.databinding.FragmentFragemnt2Binding;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragemnt2 extends Fragment  {

    FragmentFragemnt2Binding b;

    public Fragemnt2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        b = DataBindingUtil.inflate(inflater,R.layout.fragment_fragemnt2, container, false);

        return b.getRoot();
    }

    public void data(String s) {
//        Toast.makeText(getContext(), "f2: "+s, Toast.LENGTH_SHORT).show();

        b.text.setText(s);

    }
}
