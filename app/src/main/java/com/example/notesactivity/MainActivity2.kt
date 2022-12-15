package com.example.notesactivity

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notesactivity.ui.theme.NotesActivityTheme
import java.util.*

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            val startDate = Calendar.getInstance().time

            val c: Calendar = Calendar.getInstance()
            c.setTime(startDate)
            c.add(Calendar.DATE, 1)
            val expDate: Date = c.getTime()

            if(startDate.after(expDate)){
                // Your time expired do your logic here.
                Log.e("DateCheck","Your date is expired")

            }else{
                Log.e("DateCheck","valid")

            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    NotesActivityTheme {
        Greeting2("Android")
    }
}