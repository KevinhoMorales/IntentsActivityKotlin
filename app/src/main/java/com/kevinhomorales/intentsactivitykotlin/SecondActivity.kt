package com.kevinhomorales.intentsactivitykotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kevinhomorales.intentsactivitykotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpView()
    }

    private fun setUpView() {
        if (intent != null) {
            val helloWorld = intent.getStringExtra("hello")!!
            binding.textId.setText(helloWorld)
        }
        setUpActions()
    }

    private fun setUpActions() {
        binding.buttonId.setOnClickListener {
            finish()
        }
    }
}