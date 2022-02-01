package br.com.adonaipinheiro.calctrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.adonaipinheiro.calctrip.databinding.ActivityMainBinding
import br.com.adonaipinheiro.calctrip.extensions.valueDouble

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener() {
            calculateTrip()
        }
    }

    private fun calculateTrip() {
        val distance = binding.totalDistance.valueDouble()
        val gasPrice = binding.gasPrice.valueDouble()
        val autonomy = binding.autonomy.valueDouble()
        val total = (distance / autonomy) * gasPrice

        binding.totalPrice.text = "$total"
    }
}