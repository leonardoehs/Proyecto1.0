package com.uso.proyecto.GUI.inicio;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class InicioViewModel extends ViewModel {

    private MutableLiveData<String> txtInicio1 = new MutableLiveData<>();
    private MutableLiveData<String> txtInicio2 = new MutableLiveData<>();

    public void setTxtInicio1(String text) {
        this.txtInicio1.setValue(text);
    }

    public LiveData<String> getTxtInicio1() {
        return txtInicio1;
    }
    public void setTxtInicio2(String text) {
        this.txtInicio2.setValue(text);
    }

    public LiveData<String> getTxtInicio2() {
        return txtInicio2;
    }
}