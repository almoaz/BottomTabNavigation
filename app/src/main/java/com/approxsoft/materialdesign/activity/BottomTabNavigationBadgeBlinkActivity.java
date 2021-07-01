package com.approxsoft.materialdesign.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.approxsoft.materialdesign.R;
import com.approxsoft.materialdesign.Tools.Tools;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomTabNavigationBadgeBlinkActivity extends AppCompatActivity {

    private TextView TextMessage;
    private BottomNavigationView bottomNavigation;
    private View searchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_tab_navigation_badge_blink);

        Components();
    }

    private void Components() {
        searchBar = (View) findViewById(R.id.searchBar);
        TextMessage = (TextView) findViewById(R.id.searchText);


        bottomNavigation = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return true;
            }
        });

        BadgeDrawable badgeFav = bottomNavigation.getOrCreateBadge(R.id.icon_1);
        badgeFav.setVisible(true);
        badgeFav.setNumber(4);
        badgeFav.setVerticalOffset(Tools.dpToPx(BottomTabNavigationBadgeBlinkActivity.this, 3));
        badgeFav.setBackgroundColor(getResources().getColor(R.color.Green));

        BadgeDrawable badgeBook = bottomNavigation.getOrCreateBadge(R.id.icon_5);
        badgeBook.setVisible(true);
        badgeBook.setVerticalOffset(Tools.dpToPx(this, 3));
        badgeBook.setNumber(999);
        badgeBook.setMaxCharacterCount(2);
        badgeBook.setBackgroundColor(getResources().getColor(R.color.Red));

        Handler handler = new Handler(this.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                badgeBook.setVisible(!badgeBook.isVisible());
                handler.postDelayed(this, 1000);
            }
        }, 1000);

        bottomNavigation.setSelectedItemId(R.id.icon_2);
        ((ImageButton) findViewById(R.id.bt_menu)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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