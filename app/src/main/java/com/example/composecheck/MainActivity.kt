package com.example.composecheck
import androidx.compose.ui.text.font.FontStyle // Make sure this import is correct

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composecheck.ui.theme.ComposeCheckTheme
import androidx.compose.ui.unit.dp
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val navController= rememberNavController()
//            NavHost(navController = navController, startDestination ="screen_A" , builder = {
//                composable("screen_A"){
//                    ScreenA(navController)
//                }
//                composable("screen_B"){
//                    ScreenB()
//                }
//            })
            ScreenA()



        }
    }
}

//@Composable
//fun Rahim(name:String){
//    Text(text = "Hello $name")
//
//}
//
//@Composable
//fun  MyTextField() {
//    val state= remember {
//        mutableStateOf(value="")
//    }
//    TextField(value = state.value, onValueChange ={state.value=it} , label = { Text(text = "Login")})
//
//}
//
//@Preview(showBackground = true, name = "Hello msg")
//@Composable
//private fun PreviewFunction() {
//    Text(text = "Rahima", fontStyle = FontStyle.Italic) // Correct usage
//    MyTextField()
//}
