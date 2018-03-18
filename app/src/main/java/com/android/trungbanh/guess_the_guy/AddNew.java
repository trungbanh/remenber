package com.android.trungbanh.guess_the_guy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class AddNew extends AppCompatActivity {

    String arr[] = {"giám  đốc",
                    "phó giám đốc",
                    "gần phó giám đốc"};
    ArrayList<String> old ;

    Button save ;

    RadioButton nam ;
    RadioButton nu ;

    EditText ten ;
    EditText sdt ;
    EditText them ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);

        old = new ArrayList<>();
        Spinner spin = findViewById(R.id.Sp_nghe);
        ArrayAdapter<String> adapter = new ArrayAdapter <String>(this
                ,android.R.layout.simple_spinner_item,arr);

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spin.setAdapter(adapter);
        for (int i =20 ; i<=60;i++){
            old.add(String.valueOf(i));
        }

        Spinner spintuoi = findViewById(R.id.Sp_tuoi);
        ArrayAdapter<String> oldAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,old);
        oldAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spintuoi.setAdapter(oldAdapter);

        ten = findViewById(R.id.edt_name);

        nam = findViewById(R.id.cb_man);
        nu = findViewById(R.id.cb_non_man);


        save = findViewById(R.id.btn_save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                if (nam.isChecked()){
                    i.putExtra("name","mr:"+ten.getText());
                } else {
                    i.putExtra("name","mrs:"+ten.getText());
                }

                startActivity(i);
            }
        });

    }
}
