package com.uso.proyecto.GUI.reportes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.uso.proyecto.GUI.contactos.ContactosViewModel;
import com.uso.proyecto.R;

public class ReportesFragment extends Fragment {
    public static ReportesFragment newInstance() {
        return new ReportesFragment();
    }


    private ReportesViewModel reportesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        reportesViewModel = ViewModelProviders.of(this).get(ReportesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_reportes, container, false);
        final TextView txtReportes = root.findViewById(R.id.txtReporte);
        reportesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtReportes.setText(s);
            }
        });
        return root;
    }
}
