package com.example.frorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.SplashScreen
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //Thread.sleep(5000)
        setTheme(R.style.Theme_Frorapp)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtTitle.text = getString(R.string.title)

        val listTop5Flowers = listOf (
            Flower(getString(R.string.rose), getString(R.string.roseDescription), R.drawable.rose),
            Flower(getString(R.string.carnation), getString(R.string.magnoliaDescription), R.drawable.carnation),
            Flower(getString(R.string.sunflower), getString(R.string.sunflowerDescription), R.drawable.sunflower),
            Flower(getString(R.string.hydrangea), getString(R.string.hydrangeaDescription), R.drawable.hydrangea),
            Flower(getString(R.string.magnolia), getString(R.string.magnoliaDescription), R.drawable.magnolia)
        )

        val adapter = FlowersAdapter(this, listTop5Flowers)
        lvFlowers.adapter = adapter
    }
}

// Referencias <>
// splash screen: https://www.youtube.com/watch?v=ksaaMt8Lo6U&t=171s
// Layout list: https://www.youtube.com/watch?v=5JrfsvTyFo8
// traducciones: https://www.youtube.com/watch?v=8rHRlye4QQY
// texto: https://www.verdissimo.com/es/noticias/flores-mas-bonitas-del-mundo#6_Tulipan