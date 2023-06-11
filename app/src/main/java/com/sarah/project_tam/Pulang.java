package com.sarah.project_tam;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class Pulang extends Fragment {


    public Pulang() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final  View view = inflater.inflate(R.layout.fragment_pulang, container, false);

        ImageButton foto = view.findViewById(R.id.ambil);
        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_pulang2_to_foto2);
            }
        });

        Button kirim = view.findViewById(R.id.kirim_btn);
        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_pulang2_to_submit);
            }
        });

        ImageButton arrow = view.findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_pulang2_to_utama);
            }
        });
        return view;
    }
}