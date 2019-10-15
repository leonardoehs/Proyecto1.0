package com.uso.proyecto.GUI.reportes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReportesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReportesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenido a los Rportes");
    }

    public LiveData<String> getText() {
        return mText;
    }
}