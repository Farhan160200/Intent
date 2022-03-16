package com.farhanfarkaann.intent.activitydestination

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanfarkaann.intent.MainActivity
import com.farhanfarkaann.intent.databinding.ActivitySimplePutExtraDestinationBinding

class SimplePutExtraDestinationActivity : AppCompatActivity() {
    lateinit var binding :ActivitySimplePutExtraDestinationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySimplePutExtraDestinationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra(MainActivity.MESSAGE)
        val age = intent.getIntExtra(MainActivity.AGE,0)

        binding.tvMessage.text = message
        binding.tvAge.text = age.toString()
    }
}