package com.app.floatingactionbuttonjitpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.app.floatingactionbuttonjitpackcompose.ui.theme.FloatingActionButtonJitpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FloatingActionButtonJitpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    FloatingActionButton()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FloatingActionButtonJitpackComposeTheme {
       //
    // Greeting("Android")
        FloatingActionButton()
    }
}

// make a function
@Composable
fun FloatingActionButton(){
    var value by remember { mutableStateOf(0)}
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        floatingActionButton = {
            FloatingActionButton(
                contentColor = Color.White,
                content =  { Icon(Icons.Default.Add, contentDescription ="floating action Button" )},
                onClick = {
                    value ++
                }
            )
        },
        content = {
            Text(
                text = "$value",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold
            )
        }
    )


}