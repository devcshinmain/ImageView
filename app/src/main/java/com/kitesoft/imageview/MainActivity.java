package com.kitesoft.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn_australia, btn_belgium, btn_canada, btn_korea;

    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img= (ImageView)findViewById(R.id.img);
        btn_australia= (Button)findViewById(R.id.btn_australia);
        btn_belgium= (Button)findViewById(R.id.btn_belgium);
        btn_canada= (Button)findViewById(R.id.btn_canada);
        btn_korea= (Button)findViewById(R.id.btn_korea);

        btn_australia.setOnClickListener(listener);
        btn_belgium.setOnClickListener(listener);
        btn_canada.setOnClickListener(listener);
        btn_korea.setOnClickListener(listener);



        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                if(num>5) num=0;

                img.setImageResource( R.drawable.australia + num );
            }
        });

    }

    View.OnClickListener listener= new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int id= v.getId();

            switch (id){
                case R.id.btn_australia:
                    img.setImageResource(R.drawable.australia);
                    break;

                case R.id.btn_belgium:
                    img.setImageResource(R.drawable.belgium);
                    break;

                case R.id.btn_canada:
                    img.setImageResource(R.drawable.canada);
                    break;

                case R.id.btn_korea:
                    img.setImageResource(R.drawable.korea);
                    break;
            }
        }
    };
}






















