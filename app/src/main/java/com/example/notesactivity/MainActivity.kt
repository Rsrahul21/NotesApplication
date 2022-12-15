package com.example.notesactivity

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notesactivity.ui.theme.NotesActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android")
        }
    }
}

@Composable
fun Greeting(name: String) {

    Column(
        modifier = Modifier
            .padding(top = 15.dp)
            .fillMaxWidth(1f)
            .border(5.dp,Color.Green)
            .fillMaxHeight(1f)
            .background(Color.Cyan).border(2.dp,Color.Green, shape = RectangleShape)
    ) {
        Text(text = "Hello $name!",Modifier.clickable {
        }.offset(20.dp,30.dp).clickable {

        })
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Hello $name!",Modifier.offset(20.dp))

        Text(text = "Hello $name!")
        Text(text = "Hello $name!")
        Text(text = "Hello $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Android")
}