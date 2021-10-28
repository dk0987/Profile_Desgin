package com.example.profiledesgin.presentation.profile_screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.profiledesgin.presentation.profile_screen.util.Item

@Composable
fun PostItem(
    item : Item
) {
    Card(modifier = Modifier
        .width(100.dp)
        .height(200.dp)
        .padding(10.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = 10.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(item.color),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = item.pic),
                contentDescription = "Image",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp),
//                contentScale = ContentScale.Crop
            )
        }
    }
}