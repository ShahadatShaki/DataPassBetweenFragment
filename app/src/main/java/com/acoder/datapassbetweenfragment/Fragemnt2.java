package com.acoder.datapassbetweenfragment;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.acoder.datapassbetweenfragment.databinding.FragmentFragemnt2Binding;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragemnt2 extends Fragment  {

    private MainActivityVM viewModel;
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this.getActivity()).get(MainActivityVM.class);

        viewModel.getString().observe(this, item -> {
            displayDetails(viewModel.getString().getValue());
        });
    }

    public void displayDetails(String player){
        textView.setText(player);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragemnt2,
                container, false);

        textView = view.findViewById(R.id.text);

        return view;
    }
}
