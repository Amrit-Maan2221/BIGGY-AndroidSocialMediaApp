/*
To Do-



Help- 26:00



 */




package com.example.biggy_social_media;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.biggy_social_media.Fragment.AddFragment;
import com.example.biggy_social_media.Fragment.HomeFragment;
import com.example.biggy_social_media.Fragment.NotificationFragment;
import com.example.biggy_social_media.Fragment.ProfileFragment;
import com.example.biggy_social_media.Fragment.SearchFragment;
import com.example.biggy_social_media.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private Fragment selectorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()) {
                    case R.id.home:
                        selectorFragment = new HomeFragment();
                        break;
                    case R.id.search:
                        selectorFragment = new SearchFragment();
                        break;
                    case R.id.notifications:
                        selectorFragment = new NotificationFragment();
                        break;
                    case R.id.person:
                        selectorFragment = new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutReplace , selectorFragment).commit();

                return  true;
            }});
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutReplace , new HomeFragment()).commit();
    }



    public void postActivity(View view) {
        Intent intent = new Intent(this, PostActivity.class);
        startActivity(intent);
    }
}