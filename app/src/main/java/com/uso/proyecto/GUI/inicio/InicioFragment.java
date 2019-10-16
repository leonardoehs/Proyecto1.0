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
    public static InicioFragment newInstance() {
        return new InicioFragment();
    }

    private EditText edtInicio;
    private TextView txtInicio;
    private InicioViewModel inicioViewModel;

    /*public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_inicio, container, false);
        inicioViewModel = ViewModelProviders.of(this).get(InicioViewModel.class);

        txtInicio=root.findViewById(R.id.txtInicio);
        edtInicio=root.findViewById(R.id.edtInicio);
        Button btn=root.findViewById(R.id.btnInicio);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inicioViewModel.setTxtInicio(edtInicio.getText().toString());
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        inicioViewModel=ViewModelProviders.of(getActivity()).get(InicioViewModel.class);
        inicioViewModel.getTxtInicio().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                txtInicio.setText(s);
            }
        });
    }
     */
    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_inicio, container, false);
        return root;
    }
}
