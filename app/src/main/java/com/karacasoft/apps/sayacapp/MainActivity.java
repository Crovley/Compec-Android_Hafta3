package com.karacasoft.apps.sayacapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;

    private TextView counterScreen;

    public int sayac = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.buttonAdd);
        btn2 = (Button) findViewById(R.id.buttonReset);

        counterScreen = (TextView) findViewById(R.id.sayacEkrani);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.buttonAdd) {
            sayac++;
        } else if(view.getId() == R.id.buttonReset) {
            sayac = 0;
        }
        counterScreen.setText(String.valueOf(sayac));

    }
}
