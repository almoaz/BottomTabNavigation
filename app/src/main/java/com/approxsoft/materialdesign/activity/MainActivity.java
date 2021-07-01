package com.approxsoft.materialdesign.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.approxsoft.materialdesign.R;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BottomTabNavigationLight = findViewById(R.id.btn_1);
        Button BottomTabNavigationDark = findViewById(R.id.btn_2);
        Button BottomTabNavigationColorShift = findViewById(R.id.btn_3);
        Button BottomTabNavigationNight = findViewById(R.id.btn_4);
        Button BottomTabNavigationIcon = findViewById(R.id.btn_5);
        Button BottomTabNavigationAnimation = findViewById(R.id.btn_6);
        Button BottomTabNavigationBadgeBlink = findViewById(R.id.btn_7);
        Button BottomTabNavigationSimple = findViewById(R.id.btn_8);

        BottomTabNavigationLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,BottomTabNavigationLightActivity.class);
                startActivity(intent);
            }
        });

        BottomTabNavigationDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,BottomTabNavigationDarkActivity.class);
                startActivity(intent);
            }
        });

        BottomTabNavigationColorShift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,BottomTabNavigationColorShiftActivity.class);
                startActivity(intent);
            }
        });

        BottomTabNavigationNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,BottomTabNavigationNightActivity.class);
                startActivity(intent);
            }
        });

        BottomTabNavigationIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,BottomTabNavigationIconActivity.class);
                startActivity(intent);
            }
        });

        BottomTabNavigationAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,BottomTabNavigationAnimationActivity.class);
                startActivity(intent);
            }
        });

        BottomTabNavigationBadgeBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,BottomTabNavigationBadgeBlinkActivity.class);
                startActivity(intent);
            }
        });

        BottomTabNavigationSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,BottomTabNavigationSimpleActivity.class);
                startActivity(intent);
            }
        });



    }
}