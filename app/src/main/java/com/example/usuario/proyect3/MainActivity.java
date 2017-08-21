package com.example.usuario.proyect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv;
    private RadioButton r1,r2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton)findViewById(R.id.r2);
        tv = (TextView)findViewById(R.id.resul);


    }

    //metodo se ejucata cuando se precione un button

    public void operar(View view){
        int val1 = Integer.parseInt(et1.getText().toString());
        int val2 = Integer.parseInt(et2.getText().toString());

        if(r1.isChecked()==true){
            int sum = val1+val2;
            String resul = String.valueOf(sum);
            tv.setText(resul);

        }else if(r2.isChecked()==true){
            int res = val1-val2;
            String resul = String.valueOf(res);
            tv.setText(resul);
        }
    }
}
