package com.example.marvelapp.core.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marvelapp.R
import com.example.marvelapp.core.theme.Brown
import com.example.marvelapp.core.theme.Indigo
import com.example.marvelapp.core.theme.MarvelAppTheme

@Composable
fun AvatarCard(modifier: Modifier) {
    Box(
        modifier = Modifier
            .size(50.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Indigo,
                        Brown,
                    )
                ), shape = CircleShape
            ),
        contentAlignment = Alignment.Center,
    )
    {
        Image(
            painter = painterResource(id = R.drawable.unknown_character),
            contentDescription = R.string.avatar.toString(),
            modifier = Modifier
                .size(100.dp)
                .absoluteOffset(y = 1.5.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AvatarCardPreview() {
    MarvelAppTheme {
        AvatarCard(modifier = Modifier)
    }
}