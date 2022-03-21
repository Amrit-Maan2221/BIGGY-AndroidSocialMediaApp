/*
To Do-
Fix Bottom Navigation
 */




package com.example.biggy_social_media;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.biggy_social_media.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}