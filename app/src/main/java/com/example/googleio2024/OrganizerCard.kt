package com.example.googleio2024

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun OrganizerCard(
    organizer: Organizer,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier.wrapContentHeight()
    ) {
        AsyncImage(
            modifier =
                Modifier
                    .aspectRatio(1f)
                    .clip(CircleShape),
            model = organizer.imageUrl,
            contentDescription = null,
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = organizer.name,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OrganizerPreview() {
    OrganizerCard(
        modifier = Modifier.width(100.dp),
        organizer =
            Organizer(
                id = 1,
                name = "최성훈",
                imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_250,h_250,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/avatars/seonghoon_choi.png",
            ),
    )
}
