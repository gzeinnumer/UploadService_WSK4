package com.gzeinnumer.uploadservice_wsk4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSelectImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hasil perubahan

        btnSelectImage =findViewById(R.id.btn_select_image);
        btnSelectImage.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

    }
}
