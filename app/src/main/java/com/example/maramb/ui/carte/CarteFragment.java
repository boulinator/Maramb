package com.example.maramb.ui.carte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.maramb.R;

public class CarteFragment extends Fragment {
    private CarteViewModel carteViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        carteViewModel =
                new ViewModelProvider(this).get(CarteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_carte, container, false);
        final TextView textView = root.findViewById(R.id.text_carte);
        carteViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

