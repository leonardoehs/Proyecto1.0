package com.uso.proyecto.GUI.scanner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.uso.proyecto.GUI.contactos.ContactosViewModel;
import com.uso.proyecto.R;

public class ScannerFragment extends Fragment {
    public static ScannerFragment newInstance() {
        return new ScannerFragment();
    }


    private ScannerViewModel scannerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        scannerViewModel = ViewModelProviders.of(this).get(ScannerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_scanner, container, false);
        final TextView txtScanner = root.findViewById(R.id.txtScanner);
        scannerViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtScanner.setText(s);
            }
        });
        return root;
    }
}
