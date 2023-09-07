package com.example.marvelapp.core.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marvelapp.R
import com.example.marvelapp.core.theme.MarvelAppTheme

@Composable
fun SeeAllButton(
    modifier: Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    TextButton(
        onClick = onClick,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        modifier = modifier
            .requiredWidth(width = 85.dp)
            .requiredHeight(height = 56.dp)
    )
    {
        Box(
            modifier = modifier
                .requiredWidth(width = 85.dp)
                .requiredHeight(height = 56.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.custom_see),
                contentDescription = R.string.custRect.toString(),
            )
            Image(
                painter = painterResource(id = R.drawable.icon_right),
                contentDescription = R.string.ic_right.toString(),
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 29.dp,
                        y = 12.dp
                    )
                    .requiredSize(size = 27.dp)
            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun SeeAllButtonPreview() {
    MarvelAppTheme {
        SeeAllButton(onClick = {}, modifier = Modifier)
    }
}