package com.example.profiledesgin.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.example.profiledesgin.presentation.profile_screen.ProfileScreen
import com.example.profiledesgin.presentation.ui.theme.ProfileDesginTheme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileDesginTheme {
               ProfileScreen()
            }
        }
    }
}
