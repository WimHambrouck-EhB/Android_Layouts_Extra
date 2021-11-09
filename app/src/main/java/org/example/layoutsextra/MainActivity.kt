package org.example.layoutsextra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // only using LinearLayouts:
        //setContentView(R.layout.activity_main_linear)

        // only using ConstraintLayout:
        setContentView(R.layout.activity_main_constraint)

        supportActionBar?.hide()
    }
}