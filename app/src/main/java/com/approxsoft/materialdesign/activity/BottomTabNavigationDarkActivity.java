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

public class BottomTabNavigationDarkActivity extends AppCompatActivity {

    private TextView TextMessage;
    private BottomNavigationView bottomNavigation;
    private View searchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_tab_navigation_dark);

        Components();
    }

    private void Components() {
        searchBar = (View) findViewById(R.id.searchBar);
        TextMessage = (TextView) findViewById(R.id.searchText);


        bottomNavigation = (BottomNavigationView) findViewById(R.id.navigation);


        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.icon_recent) {
                    TextMessage.setText(item.getTitle());

                    return true;
                } else if (itemId == R.id.icon_favorites) {
                    TextMessage.setText(item.getTitle());

                    return true;
                } else if (itemId == R.id.icon_nearby) {
                    TextMessage.setText(item.getTitle());

                    return true;
                }
                return false;
            }
        });

        NestedScrollView nested_content = (NestedScrollView) findViewById(R.id.nested_scroll_view);
        nested_content.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY < oldScrollY) { // up
                    animateNavigation(false);
                    animateSearchBar(false);
                }
                if (scrollY > oldScrollY) { // down
                    animateNavigation(true);
                    animateSearchBar(true);
                }
            }
        });

        // For drawable display image

        Tools.displayImageOriginal(this,  findViewById(R.id.image1), R.drawable.image1);
        Tools.displayImageOriginal(this,  findViewById(R.id.image2), R.drawable.image2);
        Tools.displayImageOriginal(this,  findViewById(R.id.image3), R.drawable.image3);
        Tools.displayImageOriginal(this,  findViewById(R.id.image4), R.drawable.image4);
        Tools.displayImageOriginal(this,  findViewById(R.id.image5), R.drawable.image5);
        Tools.displayImageOriginal(this,  findViewById(R.id.image6), R.drawable.image1);
        Tools.displayImageOriginal(this,  findViewById(R.id.image7), R.drawable.image2);
        Tools.displayImageOriginal(this,  findViewById(R.id.image8), R.drawable.image3);
        Tools.displayImageOriginal(this,  findViewById(R.id.image9), R.drawable.image4);

        ( findViewById(R.id.bt_menu)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);
    }


    boolean isNavigationHide = false;

    private void animateNavigation(final boolean hide) {
        if (isNavigationHide && hide || !isNavigationHide && !hide) return;
        isNavigationHide = hide;
        int moveY = hide ? (2 * bottomNavigation.getHeight()) : 0;
        bottomNavigation.animate().translationY(moveY).setStartDelay(100).setDuration(300).start();
    }

    boolean isSearchBarHide = false;

    private void animateSearchBar(final boolean hide) {
        if (isSearchBarHide && hide || !isSearchBarHide && !hide) return;
        isSearchBarHide = hide;
        int moveY = hide ? -(2 * searchBar.getHeight()) : 0;
        searchBar.animate().translationY(moveY).setStartDelay(100).setDuration(300).start();
    }
}