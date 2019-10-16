package com.uso.proyecto.GUI.inicio;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class InicioViewModel extends ViewModel {

    private MutableLiveData<String> txtInicio = new MutableLiveData<>();

    public void setTxtInicio(String text) {
        this.txtInicio.setValue(text);
    }

    public LiveData<String> getTxtInicio() {
        return txtInicio;
    }
}