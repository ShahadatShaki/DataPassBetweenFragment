package com.acoder.datapassbetweenfragment;


import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

    private MainActivityVM viewModel;
    FragmentFragment1Binding b;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        viewModel = ViewModelProviders.of(this.getActivity()).get(MainActivityVM.class);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        b = DataBindingUtil.inflate(inflater,R.layout.fragment_fragment1,
                container, false);

        b.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                dataPass.data(s.toString());

                viewModel.setString(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        return b.getRoot();
    }
}
