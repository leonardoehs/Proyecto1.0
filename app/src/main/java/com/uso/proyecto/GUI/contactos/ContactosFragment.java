package com.uso.proyecto.GUI.contactos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.uso.proyecto.R;

public class ContactosFragment extends Fragment {

    private ContactosViewModel contactosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        contactosViewModel = ViewModelProviders.of(this).get(ContactosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contactos, container, false);
        final TextView txtContacto = root.findViewById(R.id.txtContacto);
        contactosViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtContacto.setText(s);
            }
        });
        return root;
    }
}
