package com.example.labo3_pdm_ejercicio_00159817;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.labo3_pdm_ejercicio_00159817.utils.AppConstants;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2, et3, et4;
    private Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.e_t1);
        et2=findViewById(R.id.e_t2);
        et3=findViewById(R.id.e_t3);
        et4=findViewById(R.id.e_t4);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(v->{
            Intent i1 = new Intent(MainActivity.this, NewActivity.class);
            i1.setType("text/plain");
            if (Patterns.EMAIL_ADDRESS.matcher(et3.getText()).matches() && !(et1.getText().toString().equals("")) && !(et2.getText().toString().equals("")) && !(et4.getText().toString().equals(""))){
                String[] et = {et1.getText().toString(), et2.getText().toString(), et3.getText().toString(),et4.getText().toString()};
                i1.putExtra(AppConstants.T1, et);
                startActivity(i1);
            }
            else {
                Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
            }
        });
    }
}
