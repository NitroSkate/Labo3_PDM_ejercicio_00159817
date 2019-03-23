package com.example.labo3_pdm_ejercicio_00159817;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.labo3_pdm_ejercicio_00159817.utils.AppConstants;

public class NewActivity extends AppCompatActivity {

    private TextView tv1, tv2, tv3, tv4;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        btn1=findViewById(R.id.bt2);
        Intent mIntent = getIntent();
        if(mIntent != null){
            String[] text = mIntent.getStringArrayExtra(AppConstants.T1);
            tv1.setText(text[0]);
            tv2.setText(text[1]);
            tv3.setText(text[2]);
            tv4.setText(text[3]);
            btn1.setOnClickListener(e->{
                Intent nIntent = new Intent();
                nIntent.setAction(Intent.ACTION_SEND);
                nIntent.setType("text/plain");
                nIntent.putExtra(Intent.EXTRA_TEXT, text[0]+text[1]+text[2]+text[3]);
                startActivity(nIntent);
            });
        }
    }
}
