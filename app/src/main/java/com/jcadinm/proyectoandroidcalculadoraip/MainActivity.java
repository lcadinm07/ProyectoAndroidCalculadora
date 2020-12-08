package com.jcadinm.proyectoandroidcalculadoraip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_1;
    EditText et_2;
    EditText et_3;
    EditText et_4;
    EditText et_5;
    EditText et_6;
    Button bt_calcular;
    Button bt_limpiar;
    Button bt_mostrar;
    TextView tv_di_red;
    TextView tv_mascara;
    TextView tv_ip_inicial;
    TextView tv_ip_final;
    TextView tv_broadcast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}