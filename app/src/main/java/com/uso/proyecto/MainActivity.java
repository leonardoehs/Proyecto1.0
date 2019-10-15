package com.uso.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Iniciar Sesion");
        }
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
    }
    public void clickNuevo(View v){
        if(username.getText().toString().isEmpty()){
            Toast.makeText(this,"!Por favor ingrse su usuario!",Toast.LENGTH_SHORT).show();
        }else if(password.getText().toString().isEmpty()) {
            Toast.makeText(this, "!Por favor ingrse su contraseña!", Toast.LENGTH_SHORT).show();
        }else if(username.getText().toString().equals("root") && password.getText().toString().equals("admin")){
            Intent i = new Intent(this, PrincipalActivity.class);
            startActivity(i);
        }else{
            Toast.makeText(this, "Datos Erroneos", Toast.LENGTH_SHORT).show();
        }
    }
}
