package com.example.belajar1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class DaduActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EchoText()
        }
    }
}