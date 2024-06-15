package com.kevinhomorales.intentsactivitykotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kevinhomorales.intentsactivitykotlin.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpView()
    }

    private fun setUpView() {
        setUpActions()
    }

    private fun setUpActions() {
        binding.buttonId.setOnClickListener {
            val helloWorld = binding.helloWorldId.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("hello", helloWorld)
            startActivity(intent)
        }
    }
}