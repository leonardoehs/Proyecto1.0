package com.uso.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        BottomNavigationView boton_navegacion = findViewById(R.id.boton_navegacion);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.navigation_Inicio,R.id.navigation_contacto, R.id.navigation_scanner, R.id.navigation_reporte).build();
        NavController navController = Navigation.findNavController(this, R.id.frameContenedor);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(boton_navegacion, navController);

    }

}
