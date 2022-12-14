package com.example.belajar1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class DaduActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceApp()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DiceApp() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        var diceValue by remember {
            mutableStateOf(1)
        }

        val image = when (diceValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> {
                R.drawable.dice_6
            }
        }

        Image(
            painter = painterResource(id = image),
            contentDescription = null
        )

        Spacer(
            modifier = Modifier.height(28.dp)
        )
        Button(
            onClick = {
                diceValue = (listOf<Int>(1,6)).random()
            },
            content = {
                Text(text = "Roll")
            }
        )


    }
}