package com.example.profiledesgin.presentation.profile_screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profiledesgin.R
import com.example.profiledesgin.data.Dummy
import com.example.profiledesgin.presentation.profile_screen.component.BlueBox
import com.example.profiledesgin.presentation.profile_screen.component.PostItem
import com.example.profiledesgin.presentation.ui.theme.background
import com.example.profiledesgin.presentation.ui.theme.inactive_text_color
import com.example.profiledesgin.presentation.ui.theme.user_dp_bg
import com.example.profiledesgin.presentation.ui.theme.user_info

@ExperimentalFoundationApi
@Composable
fun ProfileScreen() {
    val data : Dummy = Dummy()
    Column(modifier = Modifier
        .fillMaxSize()
        .background(background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Profile",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth(0.8f),
            contentAlignment = Alignment.Center
        ){
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.7f),
                shape = RoundedCornerShape(20.dp),
                elevation = 10.dp
            ){
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(user_dp_bg))

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(50.dp))
                    Text(
                        text = "Mona Lisa",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Don't recognize me,forget ",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontStyle = FontStyle.Italic
                    )
                    Text(
                        text = "Yourself.It is very Nice to work,Nature Lover",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontStyle = FontStyle.Italic
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Row(modifier = Modifier
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        BlueBox(number = "389" , text = "Posts")
                        BlueBox(number = "21.3k" , text = "Followers")
                        BlueBox(number = "499" , text = "Following")
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))
            }
            Card(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .width(100.dp)
                    .height(100.dp),
                shape = CircleShape,
                elevation = 10.dp,
                border = BorderStroke(width = 3.dp , color = user_info)
            ){
                Image(
                    painter = painterResource(id = R.drawable.user_profile),
                    contentDescription = "User_profile" ,
                    contentScale = ContentScale.Crop,
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(BottomCenter),
                horizontalArrangement = Arrangement.Center
            ) {
                Card(
                    modifier = Modifier
                        .width(110.dp)
                        .height(40.dp),
                    shape = RoundedCornerShape(18.dp)
                ) {
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .background(user_info),
                        contentAlignment = Alignment.Center
                    ){
                        Text(
                            text = "FOLLOW",
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 16.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Card(
                    modifier = Modifier
                        .width(110.dp)
                        .height(40.dp),
                    shape = RoundedCornerShape(18.dp)
                ) {
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                        contentAlignment = Alignment.Center
                    ){
                        Text(
                            text = "MESSAGE",
                            textAlign = TextAlign.Justify,
                            fontWeight = FontWeight.Bold,
                            color = inactive_text_color,
                            fontSize = 16.sp,
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Post",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = "View All",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
      LazyVerticalGrid(
          cells = GridCells.Fixed(2),
          contentPadding = PaddingValues(7.dp)
      ){
          items(data.data){item ->
              PostItem(item = item)
          }
      }
    }
}