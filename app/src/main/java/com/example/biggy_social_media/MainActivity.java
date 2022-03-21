/*
To Do-
Fix Bottom Navigation (Replacing the fragment gives out exception)
 */




package com.example.biggy_social_media;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

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
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

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
                        transaction.replace(R.id.frameLayoutReplace, new HomeFragment());
                        transaction.commit();
                        return true;
                    case R.id.search:
                        transaction.replace(R.id.frameLayoutReplace, new SearchFragment());
                        transaction.commit();
                        return true;
                    case R.id.notifications:
                        transaction.replace(R.id.frameLayoutReplace, new NotificationFragment());
                        transaction.commit();
                        return true;
                    case R.id.person:
                        transaction.replace(R.id.frameLayoutReplace, new ProfileFragment());
                        transaction.commit();
                        return true;
                }
                return false;
            }});
    }



    public void testing(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Toast.makeText(this, "testingWorkked", Toast.LENGTH_SHORT).show();
        transaction.replace(R.id.frameLayoutReplace, new AddFragment());
        transaction.commit();
    }
}