package com.example.profiledesgin.data

import com.example.profiledesgin.R
import com.example.profiledesgin.presentation.profile_screen.util.Item
import com.example.profiledesgin.presentation.ui.theme.card_green
import com.example.profiledesgin.presentation.ui.theme.card_pink
import com.example.profiledesgin.presentation.ui.theme.card_sky
import com.example.profiledesgin.presentation.ui.theme.card_yellow

class Dummy {
    val data : List<Item> = listOf(
        Item(
            color = card_sky,
            pic = R.drawable.img_blue_card
        ),
        Item(
            color = card_pink,
            pic = R.drawable.img_pink_card
        ),
        Item(
            color = card_yellow,
            pic = R.drawable.img_yellow_card
        ),
        Item(
            color = card_green,
            pic = R.drawable.img_green_card
        )
    )
}