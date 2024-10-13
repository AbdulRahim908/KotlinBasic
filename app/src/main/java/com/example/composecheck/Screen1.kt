package com.example.composecheck
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth

//import androidx.navigation.NavController

@Composable
fun ScreenA(
//    navController:NavController
) {
    MyAppBar()
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Screen 1")
        Button(onClick = {""}
//        {navController.navigate("screen_B")}

        ) {
            Text(text = "Go To Screen 2")
        }
    }

}
@Composable
fun MyAppBar() {
    TopAppBar(
//        windowInsets = AppBarDefaults.topAppBarWindowInsets,
        title = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 56.dp), // Adjust padding to prevent overlap with actions
                contentAlignment = Alignment.Center
            ) {
                Text("Categories")
            }
        },
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = null)
            }
        },
        actions = {
            // RowScope here, so these icons will be placed horizontally
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.ShoppingCart, contentDescription = "Localized description")
            }

        }
    )
}