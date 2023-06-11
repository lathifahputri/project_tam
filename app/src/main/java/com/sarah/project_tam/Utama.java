package com.sarah.project_tam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Utama extends Fragment {

    public Utama() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_utama, container, false);

        ImageButton datang = view.findViewById(R.id.imageView2);
        datang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_utama_to_datang2);
            }
        });

        ImageButton pulang = view.findViewById(R.id.imageView4);
        pulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_utama_to_pulang2);
            }
        });

        ImageButton perizinan = view.findViewById(R.id.imageView5);
        perizinan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_utama_to_perizinan);
            }
        });

        ImageButton riwayat= view.findViewById(R.id.imageView7);
        riwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_utama_to_riwayat);
            }
        });
        return view;
    }
}