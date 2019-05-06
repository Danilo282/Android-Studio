package com.example.secondapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;



public class MainActivity extends AppCompatActivity {
    private EditText edtNome;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome =  (EditText)findViewById(R.id.edtNome);
        btnOk = (Button)findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);
                dig.setMessage(edtNome.getText().toString());
                dig.setNeutralButton("OK" , null);
                dig.show();
            }
        });

    }
}

