/*
To Do-
Fix Bottom Navigation
 */




package com.example.biggy_social_media;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.biggy_social_media.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }


    //Function Name: onOptionsItemSelected()
    //Parameters: MenuItem item     -   menu item
    //Description: This function is to implement the logic on menu item selected
    //Return: boolean true if successful
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (item.getItemId()){
            case R.id.home:
                Toast.makeText(this, "home", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search:
                Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.notifications:
                Toast.makeText(this, "notifications", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.person:
                Toast.makeText(this, "profile", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void testing(View view) {
        Toast.makeText(this, "testingWorkked", Toast.LENGTH_SHORT).show();
    }
}