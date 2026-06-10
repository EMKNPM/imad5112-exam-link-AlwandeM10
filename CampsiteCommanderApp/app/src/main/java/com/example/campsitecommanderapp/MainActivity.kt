package com.example.campsitecommanderapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.campsitecommanderapp.ui.theme.CampsiteCommanderAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Linking layout and kt. file

//Link activity main buttons
       val btnAddGear = findViewById<Button>(R.id.btnAddGear)
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)

        btnDisplay.setOnClickListener {
showItems() //When the btnDisplay button is clicked, the showItems function is called and implemented
        }



    }
}