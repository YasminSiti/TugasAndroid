package com.example.belajar1

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LogoClub : SixPartActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showPrincessPhoto()
        }
    }

    private fun showPrincessPhoto() {
        TODO("Not yet implemented")
    }

    private fun setContent(content: () -> Unit) {
        TODO("Not yet implemented")
    }
}

open class SixPartActivity {
    open fun onCreate(savedInstanceState: Bundle?) {


    }

}


fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}

fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showPrincessPhoto() {
    val surfaceWidth = getScreenWidth() * 0.12681;
    val surfaceHeight = getScreenHeight() * 0.1905;
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
                color = Color(0xffF0FF42),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(R.drawable.belle),
                        contentDescription = "Princess Belle",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "Belle",
                        fontSize = 16.sp,
                        color = Color.Gray,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xff004170),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.elsa),
                        contentDescription = "Princess Elsa",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "Elsa",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xffAA8B56),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.moana),
                        contentDescription = "Princess Moana",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(12.dp)
                    )
                    Text(
                        text = "Moana",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = Color(0xffCF0A0A),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.merida),
                        contentDescription = "Princess Merida",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "Merida",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xffC47AFF),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rapunzel),
                        contentDescription = "Princess Rapunzel",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "Rapunzel",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xff00ABB3),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.jasmine),
                        contentDescription = "Princess Jasmine",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "Jasmine",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}