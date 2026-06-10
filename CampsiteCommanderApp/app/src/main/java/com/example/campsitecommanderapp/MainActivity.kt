package com.example.campsitecommanderapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.ViewFlipper
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

//Fixed Parallel Arrays definition/Accounting
private val maxItems = 100
private var itemDetails = Array(maxItems) {""}
        private var categories =Array(maxItems) {""}
                private var quantities = Array(maxItems) {""}
private var comments = Array(maxItems) {""}

//Initial itemCount set to zero(0)
private var currentItemCount = 0

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Linking layout and kt. file

        //Link UI Elements
        val txtTotalItems = findViewById<TextView>(R.id.txtTotalItems)
        val txtQuantity = findViewById<TextView>(R.id.txtQuantity)
        val txtDetailedList = findViewById<TextView>(R.id.txtDetailedList)

  val edtItemName = findViewById<EditText>(R.id.edtItemName)
        val btnAddGear = findViewById<Button>(R.id.btnAddGear)
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)



        val txtCategory = findViewById<TextView>(R.id.txtCategory)
        val edtComments = findViewById<EditText>(R.id.edtComments)
        val btnDisplayGear = findViewById<Button>(R.id.btnDisplayGear)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnAddGear.setOnClickListener {
            val ItemName =
                edtItemName.text.toString() //This line is for extracting the item entered by the user
            val Category =
                txtCategory.text.toString() //This line is for extracting the category entered by the user
            val Quantity =
                txtQuantity.text.toString() //This line is for extracting the quantity entered by the user

            if (ItemName.isEmpty()) { //Checks if the Item input field was filled in
             edtItemName.text = "Please enter an item"
                return@setOnClickListener
            }
            btnDisplay.setOnClickListener {

            }

        }

    }
    private fun updateQuantityList(){
        var calculatedTotal = 0 //Set the calculated total to 0 to begin
        for (i in 0 until maxItems) {
           calculatedTotal += itemQuantities[i]
        }
        totalTextView.text =calculatedTotal.toString()

    }
}