package com.uso.proyecto.GUI.inicio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.uso.proyecto.R;


public class InicioFragment extends Fragment {

    private EditText edtInicio,edtInicio2;
    private TextView txtInicio,txtInicio2;
    private InicioViewModel inicioViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_inicio, container, false);
        inicioViewModel = ViewModelProviders.of(this).get(InicioViewModel.class);
        txtInicio=root.findViewById(R.id.txtInicio);
        txtInicio2=root.findViewById(R.id.txtInicio2);
        edtInicio=root.findViewById(R.id.edtInicio);
        edtInicio2=root.findViewById(R.id.edtInicio2);
        Button btn=root.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inicioViewModel.setTxtInicio1(edtInicio.getText().toString());
                inicioViewModel.setTxtInicio2(edtInicio2.getText().toString());
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        inicioViewModel=ViewModelProviders.of(getActivity()).get(InicioViewModel.class);
        inicioViewModel.getTxtInicio1().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                txtInicio.setText(s);
            }
        });
        inicioViewModel.getTxtInicio2().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                txtInicio2.setText(s);
            }
        });
    }
}
