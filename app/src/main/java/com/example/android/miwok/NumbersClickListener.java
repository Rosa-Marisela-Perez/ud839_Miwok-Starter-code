package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
//Metodo para poder abrir numbers
public class NumbersClickListener implements View.OnClickListener {

    @Override//metodo para conectar yb coponente xml con java
    public void onClick(View view){
        Toast.makeText(view.getContext(),"open the list of numbers",Toast.LENGTH_SHORT).show();
    }
}