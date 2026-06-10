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
                private var quantities = Array(maxItems) {0}
private var comments = Array(maxItems) {""}

//Initial itemCount set to zero(0)
private var currentItemCount = 0

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Linking layout and kt. file


        //Screen Layout Containers
        val screenSplash = findViewById<LinearLayout>(R.id.screenSplash)
        val screenMain = findViewById<LinearLayout>(R.id.mainScreenLayout)
        val screenDetails = findViewById<LinearLayout>(R.id.screenDetails)

        //Form elements and display Views
        val txtTotalItems = findViewById<TextView>(R.id.txtTotalItems)
        val txtDetailedList = findViewById<TextView>(R.id.txtDetailedList)
        val edtItemName = findViewById<EditText>(R.id.edtItemName)
        val edtCategory = findViewById<EditText>(R.id.edtCategory)
        val edtQuantity = findViewById<EditText>(R.id.edtQuantity)
        val edtComments = findViewById<EditText>(R.id.edtComments)

        val btnInitialise = findViewById<Button>(R.id.btnInitialise)
            val btnAddGear = findViewById<Button>(R.id.btnAddGear)
                val btnGoToDetails = findViewById<Button>(R.id.btnGoToDetails)
                val btnBackToBase = findViewById<Button>(R.id.btnBacktoBase)

        //Timed Splash screen
        

    }
    private fun updateQuantityList(){
        var calculatedTotal = 0 //Set the calculated total to 0 to begin
        for (i in 0 until maxItems) {
           calculatedTotal += itemQuantities[i]
        }
        totalTextView.text = calculatedTotal.toString()

    }
}