package com.lilcode.example.implicitintentexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.lilcode.example.implicitintentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun showWebPage(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://whyprogrammer.tistory.com/"))
        startActivity(intent)
    }
}