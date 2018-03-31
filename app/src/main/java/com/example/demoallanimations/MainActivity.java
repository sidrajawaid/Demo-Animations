package com.example.demoallanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.clockwise);
        btn2=findViewById(R.id.fade);
        btn3=findViewById(R.id.move);
        btn4=findViewById(R.id.blink);
        btn5=findViewById(R.id.slide);
        btn6=findViewById(R.id.zoom);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image=findViewById(R.id.imageView);
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.clockwise);
                image.setAnimation(animation);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image=findViewById(R.id.imageView);
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade);
                image.setAnimation(animation);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image=findViewById(R.id.imageView);
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
                image.setAnimation(animation);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image=findViewById(R.id.imageView);
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink);
                image.setAnimation(animation);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image=findViewById(R.id.imageView);
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide);
                image.setAnimation(animation);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image=findViewById(R.id.imageView);
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom);
                image.setAnimation(animation);
            }


        });

    }
}
