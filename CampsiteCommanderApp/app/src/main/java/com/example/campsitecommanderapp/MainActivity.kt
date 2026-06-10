package com.example.campsitecommanderapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.window.SplashScreen
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

//The following represent different layouts in ONE Activity
lateinit var welcomeSplashScreen: SplashScreen
lateinit var viewScreenLayout: LinearLayout
lateinit var mainScreenLayout: LinearLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Linking layout and kt. file

//Link mainScreen layout buttons
       val btnAddGear = findViewById<Button>(R.id.btnAddGear)
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)

        //Link viewScreenLayout components
        val txtItem = findViewById<TextView>(R.id.txtItem)
        val txtCategory = findViewById<TextView>(R.id.txtCategory)
        val txtQuantity = findViewById<TextView>(R.id.txtQuantity)
        val edtComments = findViewById<EditText>(R.id.edtComments)
        val btnDisplayGear = findViewById<Button>(R.id.btnDisplayGear)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnAddGear.setOnClickListener {
            AddItems() //When the btnAddGear button is clicked, the addItems function is called and implemented.
        }
        btnDisplay.setOnClickListener {
showItems() //When the btnDisplay button is clicked, the showItems function is called and implemented.
        }



        }
    private fun showItems() {

    }

    private fun AddItems() {

    }
}