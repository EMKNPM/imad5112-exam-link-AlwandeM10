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
import kotlin.toString

//The following represent different layouts in ONE Activity
lateinit var welcomeSplashScreen: SplashScreen
lateinit var viewScreenLayout: LinearLayout
lateinit var mainScreenLayout: LinearLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Linking layout and kt. file

        //Parallel Arrays definition/Accounting


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
            val Item =
                txtItem.text.toString() //This line is for extracting the item entered by the user
            val Category =
                txtCategory.text.toString() //This line is for extracting the category entered by the user
            val Quantity =
                txtQuantity.text.toString() //This line is for extracting the quantity entered by the user

            if (Item.isEmpty()) { //Checks if the Item input field was filled in
                txtItem.text = "Please enter an Item"
                return@setOnClickListener
            }
            btnDisplay.setOnClickListener {

            }
        }
    }
}