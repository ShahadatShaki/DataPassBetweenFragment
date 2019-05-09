package com.acoder.datapassbetweenfragment;


import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.acoder.datapassbetweenfragment.databinding.FragmentFragment1Binding;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    DataPass dataPass;

    FragmentFragment1Binding b;
    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        b = DataBindingUtil.inflate(inflater,R.layout.fragment_fragment1, container, false);


        b.buttonPanel.setOnClickListener(v->{
            String s = b.editText.getText().toString();
            dataPass.data(s);
        });

        b.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                dataPass.data(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return b.getRoot();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        dataPass = (DataPass) context;
    }
}
