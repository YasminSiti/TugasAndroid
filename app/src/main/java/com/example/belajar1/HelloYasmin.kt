package com.example.belajar1

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar1.ui.theme.Belajar1Theme

class HelloYasmin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val warnaFont = 0xff4b1263
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Cyan)
            ) {

                Image(
                    painter = painterResource(id = R.drawable._625309260),
                    contentDescription = "Gambar"
                )
                Surface(
                    color = LightGray,
                    modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Hello Yasmin Siti Atifah",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 16.dp),
                        color = DarkGray
                    ) }

                Surface(
                    color = Yellow,
                    modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Semangat yaaaaa",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                        color = Blue
                    ) }
            }
        }
    }
}