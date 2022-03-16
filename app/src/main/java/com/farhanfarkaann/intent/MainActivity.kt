package com.farhanfarkaann.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanfarkaann.intent.activitydestination.SecondAcitvity
import com.farhanfarkaann.intent.activitydestination.SimplePutExtraDestinationActivity
import com.farhanfarkaann.intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    companion object{
         const val MESSAGE = "MESSAGE"
        val AGE = "AGE"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            val sendIntent = Intent().apply{
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, binding.etMassege.text.toString())
                type =  "text/plain"


            }
            if (sendIntent.resolveActivity(packageManager) != null ){
                startActivity(sendIntent)
            }
        }
        binding.btnSimpleIntent.setOnClickListener {
            val intentToSecondAcitvity = Intent(this, SecondAcitvity::class.java)
            startActivity(intentToSecondAcitvity)
        }
        binding.btnSimplePutExtra.setOnClickListener {
            val message = binding.etMassege.text.toString()
            val age = binding.etUmur.text.toString().toInt()

            val contohSimpleIntent = Intent(this, SimplePutExtraDestinationActivity::class.java).apply{
                putExtra( MESSAGE,message)
                putExtra(AGE,age)

            }
            startActivity(contohSimpleIntent)
        }
    }

}