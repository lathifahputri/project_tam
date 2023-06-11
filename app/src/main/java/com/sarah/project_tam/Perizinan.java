package com.sarah.project_tam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Perizinan extends Fragment {

    public Perizinan() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       final View view = inflater.inflate(R.layout.fragment_perizinan, container, false);

        Button krm = view.findViewById(R.id.p_btn);
        krm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_perizinan_to_riwayat);
            }
        });
        return view;
    }
}