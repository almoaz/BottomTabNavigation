package com.approxsoft.materialdesign.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.approxsoft.materialdesign.R;
import com.approxsoft.materialdesign.Tools.Tools;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomTabNavigationSimpleActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_tab_navigation_simple);

        Components();
    }

    private void Components() {



        bottomNavigation = (BottomNavigationView) findViewById(R.id.navigation);


        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.icon_recent) {


                    return true;
                } else if (itemId == R.id.icon_favorites) {


                    return true;
                } else if (itemId == R.id.icon_nearby) {


                    return true;
                }
                return false;
            }
        });

        ( findViewById(R.id.bt_menu)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);







    }
}