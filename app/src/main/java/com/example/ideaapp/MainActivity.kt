package com.example.ideaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ideaapp.databinding.ActivityMainBinding
import com.example.ideaapp.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance()).commit()
    }
}