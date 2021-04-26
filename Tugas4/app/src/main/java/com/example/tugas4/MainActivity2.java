package com.example.tugas4;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    ImageView img;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        setTitle("2021 ON GOING DRAMA SYNOPSIS");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);

        img=(ImageView)findViewById(R.id.desc_img);
        tv1=(TextView)findViewById(R.id.desc_header);
        tv2=(TextView)findViewById(R.id.desc_desc);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));
    }
}
