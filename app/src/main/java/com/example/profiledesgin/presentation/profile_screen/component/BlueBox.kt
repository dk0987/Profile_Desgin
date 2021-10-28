package com.example.profiledesgin.presentation.profile_screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profiledesgin.presentation.ui.theme.text_color
import com.example.profiledesgin.presentation.ui.theme.user_info

@Composable
fun BlueBox(
    number : String? = null ,
    text : String,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier
        .height(80.dp)
        .width(80.dp)
        .clip(RoundedCornerShape(15.dp))
        .background(user_info)
        .padding(5.dp),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier.padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            if (number != null) {
                Text(
                    text = number,
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Text(
                text = text,
                color = Color.White,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}