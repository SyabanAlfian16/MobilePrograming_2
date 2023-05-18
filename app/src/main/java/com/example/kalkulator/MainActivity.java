package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inpAngka1 = (EditText) findViewById(R.id.inpAngka1);
        EditText inpAngka2 = (EditText) findViewById(R.id.inpAngka2);


        Button btnTambah = (Button) findViewById(R.id.btnTambah);
        Button btnKurang = (Button) findViewById(R.id.btnKurang);
        Button btnKali = (Button) findViewById(R.id.btnKali);
        Button btnBagi = (Button) findViewById(R.id.btnBagi);

        EditText inpHasil =(EditText) findViewById(R.id.inpHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double nilai_inpAngka1, nilai_inpAngka2, nilai_hasil ;

                String string_inpAngka1 = inpAngka1.getText().toString();
                String string_inpAngka2 = inpAngka2.getText().toString();

                if(string_inpAngka1.isEmpty()){
                    inpAngka1.setText("0");
                }

                if(string_inpAngka2.isEmpty()){
                    inpAngka2.setText("0");
                }

                nilai_inpAngka1 = Double.valueOf(inpAngka1.getText().toString());
                nilai_inpAngka2 = Double.valueOf(inpAngka2.getText().toString());
                nilai_hasil = nilai_inpAngka1 + nilai_inpAngka2;
                inpHasil.setText(nilai_hasil.toString());
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double nilai_inpAngka1, nilai_inpAngka2, nilai_hasil ;

                String string_inpAngka1 = inpAngka1.getText().toString();
                String string_inpAngka2 = inpAngka2.getText().toString();

                if(string_inpAngka1.isEmpty()){
                    inpAngka1.setText("0");
                }

                if(string_inpAngka2.isEmpty()){
                    inpAngka2.setText("0");
                }

                nilai_inpAngka1 = Double.valueOf(inpAngka1.getText().toString());
                nilai_inpAngka2 = Double.valueOf(inpAngka2.getText().toString());
                nilai_hasil = nilai_inpAngka1 - nilai_inpAngka2;
                inpHasil.setText(nilai_hasil.toString());
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double nilai_inpAngka1, nilai_inpAngka2, nilai_hasil ;

                String string_inpAngka1 = inpAngka1.getText().toString();
                String string_inpAngka2 = inpAngka2.getText().toString();

                if(string_inpAngka1.isEmpty()){
                    inpAngka1.setText("0");
                }

                if(string_inpAngka2.isEmpty()){
                    inpAngka2.setText("0");
                }

                nilai_inpAngka1 = Double.valueOf(inpAngka1.getText().toString());
                nilai_inpAngka2 = Double.valueOf(inpAngka2.getText().toString());
                nilai_hasil = nilai_inpAngka1 * nilai_inpAngka2;
                inpHasil.setText(nilai_hasil.toString());
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double nilai_inpAngka1, nilai_inpAngka2, nilai_hasil ;

                String string_inpAngka1 = inpAngka1.getText().toString();
                String string_inpAngka2 = inpAngka2.getText().toString();

                if(string_inpAngka1.isEmpty()){
                    inpAngka1.setText("0");
                }

                if(string_inpAngka2.isEmpty()){
                    inpAngka2.setText("0");
                }

                nilai_inpAngka1 = Double.valueOf(inpAngka1.getText().toString());
                nilai_inpAngka2 = Double.valueOf(inpAngka2.getText().toString());
                nilai_hasil = nilai_inpAngka1 / nilai_inpAngka2;
                inpHasil.setText(nilai_hasil.toString());
            }
        });

        Button btnHapus = (Button) findViewById(R.id.btnHapus);
        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inpAngka1.setText("");
                inpAngka2.setText("");
                inpHasil.setText("0");
            }
        });

        Button btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
}