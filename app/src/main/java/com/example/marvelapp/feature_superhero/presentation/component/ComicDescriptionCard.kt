package com.example.marvelapp.feature_superhero.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marvelapp.R
import com.example.marvelapp.core.theme.MarvelAppTheme

@Composable
fun ComicDescriptionCard(comicDescription: String, modifier: Modifier) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        modifier = modifier
            .requiredWidth(width = 450.dp)
            .requiredHeight(height = 245.dp)
            .clip(shape = RoundedCornerShape(14.dp))
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.custom_desc_card),
                contentDescription = "Rectangle 4391",
                modifier = Modifier
                    .requiredWidth(width = 450.dp)
                    .requiredHeight(height = 245.dp)
                    .clip(shape = RoundedCornerShape(14.dp))
            )
            Text(
                text = "SYNOPSIS",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.comic_book_bold))
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 40.dp,
                        y = 34.dp
                    )
                    .padding(
                        start = 40.dp,
                        end = 40.dp,
                        bottom = 50.dp
                    )
            )
            Text(
                text = comicDescription,
                color = Color.Black,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.comic_book)),
                    lineHeight = 14.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 40.dp,
                        y = 45.dp
                    )
                    .padding(
                        start = 40.dp,
                        end = 110.dp,
                        top = 16.dp,
                    )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComicDescriptionCardPreview() {
    MarvelAppTheme {
        ComicDescriptionCard("At the Sanctum Sanctorum, Doctor Strange uses the Eye of Agamotto on the the Sisters to make a judgement. He pulls Laura aside, asking if she is sure that they deserve her protection and salvation after the bad things they have done. She asks him to have a look at her... ", modifier = Modifier)
    }
}